package com.cts.emplymngt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="Empl")
@Table(name="empl_table")

public class Employee {
	
	@Id
	@Column(name="empId")
	
	private String employeeID;
	
	@Column(name="firstName" )
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="salary" )
	private float salary;
	
	Address address=new Address();
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String employeeID, String firstName, String lastName, float salary) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", getEmployeeID()=" + getEmployeeID() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
