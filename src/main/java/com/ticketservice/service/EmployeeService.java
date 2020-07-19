package com.ticketservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ticketservice.modal.Employee;

public class EmployeeService {

	public static void main(String[] args) {
		Map<String, Long> map = groupByDesc();
		map.forEach((k, v) -> System.out.println("Department : " + k + " : Count : " + v));
		double salary = averageSalary();
		System.out.println("Average Salary : " + Math.round(salary));
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee().setId(1).setGender("Male").setName("Jatin").setEmailid("jatin@gmail.com").setDesc("IT").setSalary(50000));
		employees.add(new Employee().setId(2).setGender("Female").setName("Miloni").setEmailid("miloni@gmail.com").setDesc("Software").setSalary(31000));
		employees.add(new Employee().setId(3).setGender("Female").setName("Divya").setEmailid("divya@gmail.com").setDesc("IT").setSalary(32000));
		employees.add(new Employee().setId(4).setGender("Male").setName("Hiren").setEmailid("hiren@gmail.com").setDesc("Software").setSalary(52000));
		employees.add(new Employee().setId(5).setGender("Male").setName("Mahesh").setEmailid("mahesh@gmail.com").setDesc("Software").setSalary(35000));
		employees.add(new Employee().setId(6).setGender("Female").setName("Hiral").setEmailid("hiral@gmail.com").setDesc("IT").setSalary(38000));
		employees.add(new Employee().setId(7).setGender("Male").setName("Niraj").setEmailid("niraj@gmail.com").setDesc("HR").setSalary(25000));
		employees.add(new Employee().setId(8).setGender("Male").setName("Harsh").setEmailid("harsh@gmail.com").setDesc("HR").setSalary(1000));
		employees.add(new Employee().setId(9).setGender("Female").setName("Shruti").setEmailid("shruti@gmail.com").setDesc("Admin").setSalary(25000));
		employees.add(new Employee().setId(10).setGender("Male").setName("Rajan").setEmailid("rajan@gmail.com").setDesc("Admin").setSalary(10000));
		return employees;
	}
	
	public static  Map<String, Long> groupByDesc(){
		return getEmployees().stream().collect(Collectors.groupingBy(Employee::getDesc, Collectors.counting()));
	}
	
	public static double averageSalary() {
		return getEmployees()
					.stream()
					.filter(e -> e.getGender().equals("Male"))
					.filter(e -> e.getSalary() > 30000.0)
					.mapToDouble(e -> e.getSalary())
					.average().getAsDouble();
	}
}
