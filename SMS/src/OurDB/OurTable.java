package OurDB;

import java.util.ArrayList;
import java.util.HashMap;

public class OurTable {
	private HashMap<String,Integer> tableNames;
	private HashMap<Integer,ArrayList<String>> tableColumns;
	private HashMap<Integer,ArrayList<String>> tableTypes;
	
	
	public void setIndex(int index,String name,ArrayList<String> columns,ArrayList<String> types){
		tableNames.put( name,index);
		tableTypes.put(index, types);
		tableColumns.put(index, types);
	}
	public int getIndexName(String name){
		return tableNames.get(name);
	}
	public ArrayList<String> getindexArrayListColumns(int index){
		return tableColumns.get(index);
	}
	public ArrayList<String> getindexArrayListType(int index){
		return tableTypes.get(index);
	}
	public HashMap<String,Integer> getTableNames() {
		return tableNames;
	}

	public void setTableNames(HashMap<String,Integer> tableNames) {
		this.tableNames = tableNames;
	}

	public HashMap<Integer,ArrayList<String>> getTableTypes() {
		return tableTypes;
	}

	public void setTableTypes(HashMap<Integer,ArrayList<String>> tableTypes) {
		this.tableTypes = tableTypes;
	}
	
	public HashMap<Integer,ArrayList<String>> getTableColumns() {
		return tableColumns;
	}

	public void setTableColumns(HashMap<Integer,ArrayList<String>> tableColumns) {
		this.tableColumns = tableColumns;
	}
	
}
