package User;

import java.io.InputStream;
import java.net.URL;
import javafx.beans.property.BooleanProperty;
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
    Class<? extends LoginController> _class = this.getClass();
    URL _resource = _class.getResource("/User/LoginFX.fxml");
    Parent root = FXMLLoader.<Parent>load(_resource);
    Scene scene = new Scene(root);
    ObservableList<Image> _icons = primaryStage.getIcons();
    Class<? extends LoginController> _class_1 = this.getClass();
    InputStream _resourceAsStream = _class_1.getResourceAsStream("Login-icon.png");
    Image _image = new Image(_resourceAsStream);
    _icons.add(_image);
    BooleanProperty _resizableProperty = primaryStage.resizableProperty();
    _resizableProperty.setValue(Boolean.FALSE);
    primaryStage.setTitle("Login Panel");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
