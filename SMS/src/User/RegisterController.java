package User;

import ocsf.client.AbstractClient;

public class RegisterController  extends AbstractClient {

	
	private RegisterUI rgs;
	
	public RegisterController(){}
	
	
	
	
	public boolean checkpass(String pass,String Rpass)
	{
		if(pass.equals(Rpass))
			return true;
		
		return false;
		
	}




	@Override
	protected void handleMessageFromServer(Object msg) {
		// TODO Auto-generated method stub
		
		
		
	}



	
	
}
