package com.cts.emplymngt.main;

import com.cts.emplymngt.bean.Employee;
import com.cts.emplymngt.service.emplService;
import com.cts.emplymngt.service.emplServiceImpl;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("hello");
		//Employee employee=new Employee("1","abc","das",1000);
		//Employee employee1=new Employee("2","efg","fgh",2000);
		
		emplService emplservice=emplServiceImpl.getInstance();
		
		System.out.println( emplservice.getEmployeeById("1"));
        System.out.println( emplservice.getEmployeeById("1"));
		
		//emplservice.insertEmployee(employee);
		//emplservice.insertEmployee(employee1);
		       // System.out.println( emplservice.getAllEmployee());
		      //  System.out.println( emplservice.getAllEmployeeByName("abc"));

		        
	}
}
