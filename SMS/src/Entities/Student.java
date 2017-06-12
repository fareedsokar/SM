package Entities;

public class Student extends User{

	public Student(int ID, String Name, String Password, String Email, int Status, AccessProfiles Access, Parent parent[]) {
		super(ID, Name, Password, Email, Status, Access);
		setParent(parent);
		// TODO Auto-generated constructor stub
	}
	private Parent parent[];
	
	public Parent[] getParent() {return parent;}
	public void setParent(Parent parent[]) {this.parent = parent;}
}
