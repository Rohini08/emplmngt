package com.cts.emplymngt.service;

import java.util.List;

import com.cts.emplymngt.bean.Employee;

public interface emplService {
	
	public String insertEmployee(Employee employee);
	public String deleteEmployee(String employeeId,Employee employee);
	public String update(String employeeId,Employee employee);
	public Employee getEmployeeById(String employeeId);
	public List<Employee> getAllEmployeeByName(String firstName);
	public List<Employee> getAllEmployee();
	
	

}
