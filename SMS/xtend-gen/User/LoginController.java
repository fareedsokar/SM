package User;

import java.io.InputStream;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class LoginController {
  /**
   * @FXML
   * private PasswordField txtpassword;
   */
  public void start(final Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.<Parent>load(this.getClass().getResource("/User/LoginFX.fxml"));
    Scene scene = new Scene(root);
    ObservableList<Image> _icons = primaryStage.getIcons();
    InputStream _resourceAsStream = this.getClass().getResourceAsStream("Login-icon.png");
    Image _image = new Image(_resourceAsStream);
    _icons.add(_image);
    primaryStage.resizableProperty().setValue(Boolean.FALSE);
    primaryStage.setTitle("Login Panel");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
