package OurMessage;

import java.util.ArrayList;

public class Response {

	private ArrayList<Object> ls;//=new ArrayList<Object>();
	private int RType;
	public static int integer=0;
	public static int string=1;
	public Response(int rtype){
		//setLs(test);
		ls=new ArrayList<Object>();
		setRType(rtype);
	}
	public int getRType() {
		return RType;
	}
	public void setRType(int rType) {
		RType = rType;
	}
	public ArrayList<Object> getLs() {
		return ls;
	}
	public void setLs(ArrayList<Object> ls) {
		this.ls = ls;
	}
	
	
}
