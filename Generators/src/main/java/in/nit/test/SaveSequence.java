
package in.nit.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee2;
import in.nit.util.HibernateUtil;

public class SaveSequence {

	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			
			Employee2 e1=new Employee2();
			//e1.setEmpId(86); //it is not taken by Hibernate
			e1.setName("cpsingh");
			e1.setSal(454.5);
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
