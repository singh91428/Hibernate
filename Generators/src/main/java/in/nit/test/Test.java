package in.nit.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			
			Employee e1=new Employee();
			//e1.setEmpId(86); //it is not taken by Hibernate
			e1.setEmpName("CPSINGH");
			e1.setEmpSal(25.50);
			e1.setDeptName("DS");
			
			Serializable s=ses.save(e1);
			Integer id=(Integer)s;
			tx.commit();
			
			System.out.println("Generated Value is:"+id);
		} catch (Exception e) {
			if(tx!=null && tx.getStatus()
					.canRollback()) 
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
}
