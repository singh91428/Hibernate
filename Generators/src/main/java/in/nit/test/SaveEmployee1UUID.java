package in.nit.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee1;
import in.nit.util.HibernateUtil;

public class SaveEmployee1UUID {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=ses.beginTransaction();
		try (ses){
			Employee1 e=new Employee1();
			e.setName("cps");
			e.setSal(343.4);
			Serializable s=ses.save(e);
			String id=(String)s;
			tx.commit();
			System.out.println("generated value is "+id);
		} catch (Exception e) {
			if(tx!=null && tx.getStatus().canRollback()) {
				tx.rollback();
			}
			// TODO: handle exception
		}
	}
}
