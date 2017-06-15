package User

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType
import javafx.scene.control.Button
import javafx.scene.control.ButtonType
import javafx.scene.control.ComboBox
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.image.Image
import javafx.scene.layout.Pane
import javafx.stage.Stage

class LoginController {
	// implements Initializable{
	/*@FXML
	 private PasswordField txtpassword;*/
	def void start(Stage primaryStage) throws Exception {
		var Parent root = FXMLLoader.load(getClass().getResource("/User/LoginFX.fxml"))
		var Scene scene = new Scene(root)
		// scene.getStylesheets().add(getClass().getResource("/User/LoginFX.css").toExternalForm());
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("Login-icon.png")))
		primaryStage.resizableProperty().setValue(Boolean.FALSE)
		primaryStage.setTitle("Login Panel")
		primaryStage.setScene(scene)
		primaryStage.show()
	}
}
