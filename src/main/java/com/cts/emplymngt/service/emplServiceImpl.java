package com.cts.emplymngt.service;

import java.util.List;


import com.cts.emplymngt.bean.Employee;
import com.cts.emplymngt.dao.emplDAO;
import com.cts.emplymngt.dao.emplDAOImpl;

public class emplServiceImpl implements emplService {

private static emplServiceImpl emplServiceImpl;
	
	private emplDAO dao=emplDAOImpl.getInstance();
	
	public static emplServiceImpl getInstance()
	{
		if(emplServiceImpl==null)
		{
			emplServiceImpl =new emplServiceImpl();
			return emplServiceImpl;
		}
		else
		{
			return emplServiceImpl;
		}
	}
	
	private emplServiceImpl()
	{
		
	}

	public String deleteEmployee(String employeeId, Employee employee) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(employeeId, employee);
	}

	public String update(String employeeId, Employee employee) {
		// TODO Auto-generated method stub
		return dao.update(employeeId, employee);
	}

	
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(employee);
	}

	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(employeeId);
	}

	public List<Employee>getAllEmployeeByName(String firstName) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByName(firstName);
	}

	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	

}
