package Student;
import java.io.IOException;
import java.net.URL;
	import ocsf.client.*;
	import java.util.ArrayList;
	import java.util.ResourceBundle;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.fxml.Initializable;
	import javafx.scene.Node;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.Pane;
	import javafx.stage.Stage;
	import javax.swing.*;
	import OurMessage.Message;
	import Entities.*; 
	
	public class Viewanswer extends AbstractClient implements Initializable{

		private TextField txtreportans; 
		private TextField txtmsgsub;
		private TextField txtreportcontent;
		private Button btnexit; 
		private Request r; //private variables
		/*
		public void getexitbutton(ActionEvent event)  {
		/*((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = loader.load(getClass().getResource("/Student/ViewResponse.fxml").openStream());
			
			ViewResponseController response = loader.getController();
		//	response.LoadRequest(this.r);
			Scene scene = new Scene(root);			
			scene.getStylesheets().add(getClass().getResource("/Student/ViewResponse.css").toExternalForm());
			primaryStage.setScene(scene);		
			primaryStage.show();
		}
		public void loadAnswer(Request r) // setting values to variables.
		{
			this.txtmsgsub.setText(((Messages)r).getMessage_Subject());
			if(r.isAccepted())
			this.txtreportans.setText("Your Request has been accepted.");
			else 
				this.txtreportans.setText("unfortunately your message has been declined");
			this.txtreportcontent.setText(((Messages)r).getMessage_Context());

		}
		public void loadReport(int id)
		{}*/
		

		public void LoadReport(int id,Object msg)
		{
			Message msg2=new Message("Select * from request where user_iD="+id,Message.select); 
			
			
		}
		
protected void handleMessageFromServer(Object msg)
		{/*
	            if(msg instanceof Messages)
	            {
	            	txtsubject.setText(((Messages)msg).getMessage_Subject());
	            	
	            }
	            else 
	            {
	            	
	            }*/
		} 
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}

		

	
}
