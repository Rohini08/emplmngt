package com.cts.emplymngt.main;

import com.cts.emplymngt.bean.Employee;
import com.cts.emplymngt.service.emplService;
import com.cts.emplymngt.service.emplServiceImpl;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("hello");
		Employee employee=new Employee("1","abc","das",1000);
		emplService emplservice=emplServiceImpl.getInstance();
		
		String s=emplservice.insertEmployee(employee);
	}
}
