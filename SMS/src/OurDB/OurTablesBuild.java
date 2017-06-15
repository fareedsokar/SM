package OurDB;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Arrays;

public class OurTablesBuild {

	private OurTable sql=new OurTable();
	
	public OurTablesBuild()
	{
		//Building a record of our tables
		String nArr[]={"id","name","password","email","status","access"};
		ArrayList<String> arrnames=new ArrayList<String>(Arrays.asList(nArr));
		String tArr[]={"Integer","String","String","String","Integer","Integer"};
		ArrayList<String> arrtypes=new ArrayList<String>(Arrays.asList(tArr));
		sql.setIndex(0, "User", arrnames,arrtypes);
		//===============================
		
	}
	
	public OurTable getOurTables(){return sql;}
	
	
}
