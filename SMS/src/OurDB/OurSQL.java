package OurDB;

public class OurSQL {
	//==============Query Parts================
	private String Part1;//SELECT/INSERT/UPDATE
	private String Part2;//FROM/INTO
	private String Part3;//WHERE
	//==============Query Types================
	private int Qtype;
	public static int insert = 1;
	public static int select = 2; 
	public static int display= 3;
	public static int update = 4;
	//=========================================
	public OurSQL(String part1,String part2,String part3,int qtype){
		setPart1(part1.replaceAll("\\s+", ""));
		setPart2(part2.replaceAll("\\s+", ""));
		setPart3(part3.replaceAll("\\s+", ""));
		setQtype(qtype);
	}
	public String getPart1() {
		return Part1;
	}
	public void setPart1(String part1) {
		Part1 = part1;
	}
	public String getPart3() {
		return Part3;
	}
	public void setPart3(String part3) {
		Part3 = part3;
	}
	public String getPart2() {
		return Part2;
	}
	public void setPart2(String part2) {
		Part2 = part2;
	}
	public int getQtype() {
		return Qtype;
	}
	public void setQtype(int qtype) {
		Qtype = qtype;
	}
	
}
