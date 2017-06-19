package Student;


import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Vector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ocsf.client.AbstractClient;
import Entities.*;
import OurMessage.Message;

import java.awt.TextField;
import java.io.IOException;


public class ViewResponseController  extends  AbstractClient implements Initializable {
      

	private Button btnviewresponse;
	private Label lblviewresponse;
	private ComboBox comboreport;
	private int count=0; 
	private int userid=0; //ask fareed !

	ObservableList<String> list;
	public Object LoadRequest()
	{
//		this.btnReportAnswer.getOnAction(); 
		Message msg=new Message("SELECT message_subject FROM messages WHERE message_id="+userid,Message.select);
	
		return msg; 
	}
	public Object Getsize() // change the query to a private query in Message and add case to the server 
	{
		Message msg=new Message("Count(Select * )FROM messages ",Message.select); 
		return msg;
	}
	
	public void ViewResponse(ActionEvent event) throws Exception// when view response pressed
	{  
		Object msg=LoadRequest(); 
		 FXMLLoader loader = new FXMLLoader();
	//	handleMessageFromServer( msg,event); 
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/Student/Viewanswer.fxml").openStream());
		
		Scene scene = new Scene(root);			
		scene.getStylesheets().add(getClass().getResource("/Student/Viewanswer.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	         
	}
	public void SetComboValues(Object msg) // ask Fareed
	{
		
		ArrayList<String> al = new ArrayList<String>();
		al=((ArrayList<String>) msg);
		list = FXCollections.observableArrayList(al);
		comboreport.setItems(list);
		comboreport.setValue(list.get(0).toString());
	}

	protected void handleMessageFromServer(Object msg) {
		
	   if(msg instanceof Request)
	   {	FXMLLoader loader = new FXMLLoader();
		   SetComboValues(msg); 
			//id = GetStudentIdBySub((String )comboreport.getValue());
	   }
	   else // msg is a number 
		   if(msg instanceof Integer)
	   {
		   this.count=(int)msg; 
	   }
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
{
		 Message msg2=new Message("Count(Select * )from request",Message.Message_count);
		    try {
				sendToServer(msg2);
				comboreport.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		Message msg=new Message("Select subject_id from request where user_id=",Message.Message_Subject);
try {
	sendToServer(msg);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 	   
}

}
