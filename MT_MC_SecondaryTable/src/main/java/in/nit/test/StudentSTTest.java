package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.StudetnWithMultiplaST;
import in.nit.sf.HibernateUtil;

public class StudentSTTest {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			StudetnWithMultiplaST s=new StudetnWithMultiplaST();
			s.setStuId(22);
			s.setStuName("venky");
			s.setStuDep("DEV");
			s.setCrsName("java");
			s.setCrsFee(200.0);
			s.setAddDetails("patna");
			s.setCrrLocation("HYD");
			ses.save(s);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
