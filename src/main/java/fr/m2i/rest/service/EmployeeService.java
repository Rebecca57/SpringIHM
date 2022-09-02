package fr.m2i.rest.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.m2i.rest.model.Employee;
import lombok.Data;

@Data
@Service
public class EmployeeService {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeService() {
		this.getEmployees();
		this.employees.add(new Employee("Calo","gero"));
		this.employees.add(new Employee("Lea","Barel"));
		this.employees.add(new Employee("Mica","Cora"));
		this.employees.add(new Employee("Mathilde","Judais"));
	}
	
	public ArrayList<Employee> getEmployees() {
		return this.employees;
	}
	
	//Methode
	public void add(Employee emp) {
		this.employees.add(emp);
	}
	
	public void delete(int index) {
		System.out.println("remove");
		this.employees.remove(index);
		System.out.println(this.employees);

			
	}

}
