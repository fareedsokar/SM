package User;

import ocsf.client.AbstractClient;

public class RegisterController  extends AbstractClient {

	
	private RegisterUI rgs;
	
	public RegisterController(){}
	
	
	
	
	public static boolean checkpass(String pass,String Rpass)
	{
		return pass.equals(Rpass);
	
		
	}




	@Override
	protected void handleMessageFromServer(Object msg) {
		// TODO Auto-generated method stub
		
		
		
	}



	
	
}
