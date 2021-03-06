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
	public Object Getsize()
	{
		Message msg=new Message("Count(Select * FROM message ",Message.select); 
		return msg;
	}
	/*
	 public void handleMessageFromClientUI(Message msg) throws IOException
	  {
	    try
	    { 
	    	
	    	sendToServer(msg);
	    }
	    catch(IOException e)
	    {
	      ClientGUI.setNotification("Could not send message to server.");
	      throw e;
	     // quit();
	    }
	  }*/
	/*public void ViewResponse(ActionEvent event)throws Exception
	{
		int id=0;
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/Student/Viewanswer.fxml").openStream());
		Scene scene = new Scene(root);	
		
         Viewanswer reportanswer = loader.getController();
		
		id = getReportById((String )comboreport.getValue());
		
		reportanswer.loadReport(id);
		scene.getStylesheets().add(getClass().getResource("/Student/Viewanswer.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	public int getReportById(Object msg)
	{
		return ((Request)msg).getMessage_Context();
		
	}
	public void setvaluescombo(Object msgsize,Object msg2)
	{
		ArrayList<String> al = new ArrayList<String>();
		/*for(int i=0;i<(int)msgsize;i++)
		{
			s1 = Test.students.get(i);
			al.add(s1.getPName() + " " + s1.getLName());
		    //System.out.print(al.get(i));
		    //System.out.print(" ");
		}
		list = FXCollections.observableArrayList(al);
		//CombStdlist.setItems(list);
		cmbStdlist.setItems(list);
	}
	 
	/*
	public void GetViewResponse(ActionEvent event) throws Exception
	{
		
		int id=0;
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("/sallytestresponse/ViewAnswersGui.fxml").openStream());
		
		Viewanswer view1 = loader.getController();
		
		//id = getStudentByname((String )cmbStdlist.getValue());
		
	//	Viewanswer.loadAnswer();
		
		Scene scene = new Scene(root);			
		scene.getStylesheets().add(getClass().getResource("/sallytestresponse/ViewAnswers.css").toExternalForm());
		
		primaryStage.setScene(scene);		
		primaryStage.show();

	}
	
	*/
	
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
		ArrayList<Request> s1=(ArrayList<Request>)msg; 
		for(int i=0;i<this.count;i++)
		{
			al.add(s1.get(i).getMessage_Subject());
		}
		list = FXCollections.observableArrayList(al);
		//CombStdlist.setItems(list);
		comboreport.setItems(list);
	}

	protected void handleMessageFromServer(Object msg) {
		
	   if(msg instanceof Request)
	   {	FXMLLoader loader = new FXMLLoader();
		   SetComboValues(msg); 
		   Viewanswer reportans = loader.getController();
			
			//id = GetStudentIdBySub((String )comboreport.getValue());
			
			reportans.LoadReport(this.userid,msg);
			
		   
	   }
	   else // msg is a number 
	   {
		   this.count=(int)msg; 
	   }
		
	}
	/*public int GetStudentIdBySub(String str,Object msg)
	{
		int id=0; 
		ArrayList<Request> s1=(ArrayList<Request>)msg; 
		for(int i=0;i<this.count;i++)
		{
			if(str.equals((s1.get(i).getMessage_Subject())))
			{
				id=s1.get(i).getUser_ID();
			}
		}
		return id; // check if its 0 
	}*/
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
{
		 Message msg2=new Message("Count(Select * )from request",Message.select);
		    try {
				sendToServer(msg2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		Message msg=new Message("Select subject_id from request where user_id=",Message.select);
try {
	sendToServer(msg);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 	   
}

}
