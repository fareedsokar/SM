package Secretary;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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


public class RegisterForExceptionsStudentController extends AbstractClient implements Initializable{

	@FXML
	private ComboBox<Object> cmbstudent;
	@FXML
	private Button btncancel;
	@FXML 
	private Button btnadd;
	
	ObservableList<Object> list;
	@Override
	protected void handleMessageFromServer(Object msg) {
		if(msg instanceof Response){
			list = FXCollections.observableArrayList(((Response)msg).getLs());
			cmbstudent.setItems(list);
			cmbstudent.setValue(list.get(0).toString());
		}
		// TODO Auto-generated method stub
		
	}
	private void setStudentComboBox() {
		
		Message msg=new Message("SELECT id FROM user WHERE access=0",Message.secretaryStudents);
		try {
			sendToServer(msg);//Get IDs of All Students
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		setStudentComboBox();
		
	}
	public void start(Stage primaryStage) throws Exception {	
		Parent root = FXMLLoader.load(getClass().getResource("/Secretary/RegisterForExceptionsStudentGUI.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("/gui/AcademicFrame.css").toExternalForm());
		primaryStage.setTitle("Registering for Exception student");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public void registerStudent(){
		
	}

}
