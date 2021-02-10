package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.util.HibernateUtil;

public class InsertTest {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
	}
}
