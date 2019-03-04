package com.cts.emplymngt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
		Session session=null;
		String query="from Empl where employeeID=?";
		Query<Employee> query2=null;
		try
		{
			session=sessionFactory.openSession();
			 //query2=session.createQuery(query);
			// query2.setParameter(0,employeeId);
			// Employee e=query2.getSingleResult();
			//Employee employee=session.get(Employee.class,employeeId);
			Employee employee1=session.load(Employee.class,employeeId);
			 return employee1;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return null;
	}

	
	public List<Employee> getAllEmployeeByName(String firstName) {
		// TODO Auto-generated method stub
		
		Session session=null;
		String query="from Empl where firstName=?";
		Query<Employee> query2=null;
		try
		{
			session=sessionFactory.openSession();
			 query2=session.createQuery(query);
			 query2.setParameter(0,firstName);
			 List<Employee> list=query2.getResultList();
			 //System.out.println(list);
			 return list;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		
		
		return null;
	}

	
	public List<Employee> getAllEmployee() {
		Session session=null; //to perform sql operation in hibernate
		String query="from Empl"; //in form of hql
		Query<Employee> query2=null;
		try
		{
		 session=sessionFactory.openSession();
		 query2=session.createQuery(query);//hql to sql transformation
		 List<Employee> list=query2.getResultList();
		 //System.out.println(list);
		 return list;
		 
		 }catch (Exception e) {
	
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		
		return null;
	}


	public String insertEmployee(Employee employee) {
		
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
