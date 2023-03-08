package Flatmap;

public class  Employee {
	private int Uid;
	private String name;
	public Employee(int uid, String name) {
		super();
		Uid = uid;
		this.name = name;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [Uid=" + Uid + ", name=" + name + "]";
	}
	
}
