package sysAdmin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Entities.TeachUnit;
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
import ocsf.client.*;
import OurMessage.*;

public class TeachunitController extends AbstractClient implements Initializable {
	
	@FXML
	private ComboBox<Object> CBteachunits;
	
	ObservableList<Object> list;
	
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/sysAdmin/TeachunitGUI.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/gui/AcademicFrame.css").toExternalForm());
		primaryStage.setTitle("Teaching Units");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	private void setCBteachunits() {
		Message msg=new Message("SELECT * FROM teaching_unit",Message.GetTeachunits);
		try {
			sendToServer(msg);//Send to server to get All Teaching units in DB
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setCBteachunits();
	}

	@Override
	protected void handleMessageFromServer(Object msg) {
		if(msg instanceof Boolean)//false user dose not exit GUI
		{
			CBteachunits.setPromptText("There is no Teaching Units");
			CBteachunits.setDisable(true);
		}
		if(msg instanceof Response){
			list = FXCollections.observableArrayList(((Response)msg).getLs());;
			CBteachunits.setItems(list);
			CBteachunits.setValue(list.get(0).toString());
		}
		// TODO Auto-generated method stub
		
	}

}
