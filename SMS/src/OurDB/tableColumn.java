package OurDB;

public class tableColumn {
	private String Name;
	private String Type;
	public tableColumn(String name,String type){
		setName(name);
		setType(type);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
}
