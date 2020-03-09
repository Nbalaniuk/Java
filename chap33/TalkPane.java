package chap33;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



public class TalkPane extends VBox
{
	private TextArea txtHistory;
	private TextField txtSend;
	private Button cmdSend;
	
	
	public TalkPane()
	{
		super();
		
		estFields();
		
		
		
		
	}
	
	public TalkPane(int nVal)
	{
		super (nVal);
		estFields();
	}
	
	private void estFields()
	{
		txtHistory = new TextArea();
		txtSend = new TextField();
		cmdSend = new Button("Send");
		
		this.getChildren().addAll(txtHistory,txtSend,cmdSend);
		this.setAlignment(Pos.CENTER);
	}
	
	
	public TextArea getHistoryRef()
	{
		return this.txtHistory;
	}
	
	public TextField getSendRef()
	{
		return this.txtSend;
	}
	
	public Button getButton()
	{
		return this.cmdSend;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
