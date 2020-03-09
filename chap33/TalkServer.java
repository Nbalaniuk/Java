package chap33;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TalkServer extends Application
{
	private TalkPane obPane;
	
	//Server connection Attributes
	public static final int SERVER_PORT = 11012;
	
	private DataInputStream obIn = null;
	private DataOutputStream obOut = null;
	
	
	@Override
	public void start(Stage obStage) throws Exception
	{
		
		obPane = new TalkPane(20);
		startService();
		
		
		obPane.getButton().setOnAction(e-> {
			try
			{
				if(obOut!=null)
				{
					obOut.writeUTF(this.obPane.getSendRef().getText());
					this.obPane.getSendRef().clear();
				}
			} 
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
		
		
		
		Scene obScene = new Scene(obPane,400,300);
		
		
		obStage.setScene(obScene);
		obStage.setTitle("TalkServer");
		obStage.show();
		
		
	}
	/**
	 * this method is responsible for creating a new socket to listen at a particular port. Must do this as a thread
	 */
	private void startService()
	{
		Thread obThread = new Thread(()-> runService());
		obThread.setDaemon(true);
		obThread.start();
		
	}
	
	private void runService()
	{
		
		//Establish a server socket
		ServerSocket obServer = null;
		Socket obSock =null;
		try
		{
			obServer = new ServerSocket(TalkServer.SERVER_PORT);
			
			Platform.runLater(() -> this.obPane.getHistoryRef().appendText("Listening for connections\n"));
			
			//Ask ther server socket to start listening. This is a blocking call in that the thread will wait for an incoming
			//Connection. Once it receives the connection, it will return a new socket on which the conversation will take place
			
			 obSock = obServer.accept();
			 
			 InetAddress obAddress = obSock.getInetAddress();
			 String sInfo = String.format("HostName %s, HostIP %s", obAddress.getHostName(),obAddress.getHostAddress());
			
			Platform.runLater(() -> this.obPane.getHistoryRef().setText("Got connection"+sInfo +"\n"));
			
			//Java allows us to actually work with the socket very much like a file
			//to this end we will create Data file handles to the socket
			this.obIn = new DataInputStream(obSock.getInputStream());
			this.obOut = new DataOutputStream(obSock.getOutputStream());
			
			//Enter into an infinite loop that just waits for a message to be relayed:
			
			while(true)
			{
				String sMesg = obIn.readUTF();
				Platform.runLater(() -> this.obPane.getHistoryRef().appendText(sMesg+"\n"));
			}
			
			
		} 
		catch (IOException e)
		{
			System.out.printf("%s",e);
			//e.printStackTrace();
		}
		finally
		{
			try
			{
				obServer.close();
				obSock.close();
				obIn.close();
				obOut.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
			//e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	

	public static void main(String[] args)
	{
		Application.launch(args);

	}

}
