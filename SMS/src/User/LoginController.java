package User;

import java.io.IOException;

import Entities.*;
import OurMessage.Message;
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
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ocsf.client.AbstractClient;


public class LoginController extends AbstractClient{// implements Initializable{

	private LoginUI lgUi;
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/User/LoginFX.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/User/LoginFX.css").toExternalForm());
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("Login-icon.png")));
		primaryStage.resizableProperty().setValue(Boolean.FALSE);
		primaryStage.setTitle("Login Panel");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	public void getFromDB(String id,String password)
	{
		Message Query= new Message("SELECT * FROM user WHERE id="+id+" AND password="+password,Message.getuser);
		try {
			sendToServer(Query);
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	@Override
	protected void handleMessageFromServer(Object msg) {
		if(msg instanceof Boolean)//false user dose not exit GUI
		{
			
			
		}
		else{
			if(msg instanceof User){
				
				switch(((User)msg).getAccess().getAccess()){
				
				case 0://Student 
					//Student std=new Student();

					break;

				case 1://teacher
					//Student Teacher=new Teacher();

					break;
					
				case 2://schoolAdmin
					
					break;

				case 3://systemAdmin
					break;

				case 4://secretry
					break;

				case 5://parent
					break;
				
				
				
				
				}		
				lgUi.setflag(false);
				lgUi.dispose();
				

				
				
			}
		}
	}
	
	
}
