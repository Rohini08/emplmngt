package com.cts.emplymngt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.emplymngt.bean.Employee;
import com.cts.emplymngt.service.emplServiceImpl;
import com.cts.emplymngt.util.emplUtil;

public class emplDAOImpl implements emplDAO {
	
private static emplServiceImpl emplServiceImpl;
	
	private static emplDAOImpl emplDAOImpl;
	public static emplDAOImpl getInstance()
	{
		if(emplDAOImpl==null)
		{
			emplDAOImpl =new emplDAOImpl();
			return emplDAOImpl;
		}
		else
		{
			return emplDAOImpl;
		}
	}
	
	private emplDAOImpl()
	{
		
	}
	
	private SessionFactory sessionFactory=emplUtil.getSessionFactory();
	

	

	
	public String update(String employeeId, Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try
		{
		 session=sessionFactory.openSession();
		 transaction=session.getTransaction();
		transaction.begin();
		session.update(employee);
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return "success";
		
	}


	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Employee> getAllEmployeeByName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}


	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try
		{
		 session=sessionFactory.openSession();
		 transaction=session.getTransaction();
		transaction.begin();
		session.save(employee);
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return "success";
	}


	public String deleteEmployee(String employeeId, Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try
		{
		 session=sessionFactory.openSession();
		 transaction=session.getTransaction();
		transaction.begin();
		session.delete(employee);
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return "success";
		
	}

}
