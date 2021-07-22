package wzy.pojo;

import org.springframework.stereotype.Component;

@Component
public class Employee {


	private int id;
	private String empname;
	private int gender;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee() {
		super();
	}
	public Employee(String empname, int gender, String email) {
		this.empname = empname;
		this.gender = gender;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", gender=" + gender + ", email=" + email + "]";
	}
	
	
}
