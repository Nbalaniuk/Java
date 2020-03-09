package chap33;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TalkClient extends Application
{
	private String sHost ="L242C20"; // Also works for other Computer names
	//private String sHost ="127.0.0.1"; // Works with IP addresses
	//private String sHost = "localhost"; // Loopback
	DataInputStream obIn = null;
	DataOutputStream obOut = null;
	private TalkPane obPane;
	
	
	
	@Override
	public void start(Stage obStage) throws Exception
	{
		this.obPane = new TalkPane();
		
		this.obPane.getButton().setOnAction(e-> {
			
			if(obOut != null)
			{
				try
				{
					obOut.writeUTF(this.obPane.getSendRef().getText());
					this.obPane.getSendRef().clear();
				} 
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
			}
			
		});
		
		estConnection();
		
		obStage.setScene(new Scene(obPane));
		obStage.setTitle("ClientTalk");
		obStage.show();
		
		
		
	}
	
	public void estConnection()
	{
		Thread obThread = new Thread(()-> runConnection());
		obThread.setDaemon(true);
		obThread.start();
	}
	
	
	/**
	 * This method will create a socket connection to specified server at specified port
	 * It will then establish the input and output data streams and listen for incoming communication
	 */
	public void runConnection()
	{
		Socket obSock = null;
		try
		{
			 obSock = new Socket(this.sHost, TalkServer.SERVER_PORT);
			obIn = new DataInputStream(obSock.getInputStream());
			obOut = new DataOutputStream(obSock.getOutputStream());
			
			while(true)
			{
				String sMesg = obIn.readUTF();
				Platform.runLater(()-> this.obPane.getHistoryRef().appendText(sMesg+"\n"));
				
			}
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
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
