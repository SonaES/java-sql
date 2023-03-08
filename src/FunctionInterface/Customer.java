package FunctionInterface;

public class Customer {
	int Regid;
	String name;
	int phonenum;
	String email;
	String location;
	public Customer(int regid, String name, int phonenum, String email, String location) {
		super();
		Regid = regid;
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.location = location;
	}
	public int getRegid() {
		return Regid;
	}
	public void setRegid(int regid) {
		Regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [Regid=" + Regid + ", name=" + name + ", phonenum=" + phonenum + ", email=" + email
				+ ", location=" + location + "]";
	}
	
	

}
