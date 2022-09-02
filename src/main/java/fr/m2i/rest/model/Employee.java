package fr.m2i.rest.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Employee {
	
	private String firstname;
	private String lastname;
	
	public Employee() {}
	
	public Employee(String f, String l) {
		this.setFirstname(f);
		this.setLastname(l);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}else if (this == null) {
			return false;
		}else if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return this.getFirstname().equals(other.getFirstname()) && this.getLastname().equals(other.getLastname());
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
