package sona;

public class Empde {
	private String name;
	private int age;
	private int noofyears;
	private double salary;
	public Empde(String name, int age, int noofyears, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.noofyears = noofyears;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoofyears() {
		return noofyears;
	}
	public void setNoofyears(int noofyears) {
		this.noofyears = noofyears;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", noofyears=" + noofyears + ", salary=" + salary + "]";
	}

}
