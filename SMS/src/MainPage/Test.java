package MainPage;
import User.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Vector;


public class Test extends Application {
	
		
	public static void main( String args[] ) throws Exception
	   { 
        launch(args);		
	  } // end main
	
	@Override
	public void start(Stage arg0) throws Exception {
		//Vector<Student> students=new Vector<Student>();
		   
								  		
		LoginController aFrame = new LoginController(); // create LoginFram
				  
		aFrame.start(arg0);
	}
	
}
