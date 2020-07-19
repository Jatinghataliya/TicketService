package com.ticketservice.modal;

public class Employee {

	private int id;
	private String name;
	private String gender;
	private String emailid;
	private String desc;
	private double salary;
	
	public int getId() {
		return id;
	}
	public Employee setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmailid() {
		return emailid;
	}
	public Employee setEmailid(String emailid) {
		this.emailid = emailid;
		return this;
	}
	public String getDesc() {
		return desc;
	}
	public Employee setDesc(String desc) {
		this.desc = desc;
		return this;
	}
	public double getSalary() {
		return salary;
	}
	public Employee setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", emailid=" + emailid + ", desc="
				+ desc + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String emailid, String desc, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.desc = desc;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGender() {
		return gender;
	}
	public Employee setGender(String gender) {
		this.gender = gender;
		return this;
	}
	
}