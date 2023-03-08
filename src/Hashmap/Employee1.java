package Hashmap;

import java.util.Objects;

public class Employee1 {
	private int id;
	private String name;
	private int age;
	private String dept;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, dept, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return age == other.age && Objects.equals(dept, other.dept) && id == other.id
				&& Objects.equals(name, other.name);
	}
	public Employee1(int id, String name, int age, String dept) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}



