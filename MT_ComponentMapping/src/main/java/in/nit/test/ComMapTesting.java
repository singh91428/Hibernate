package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Address;
import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class ComMapTesting {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			Address aob=new Address();
			aob.setHno("A/12/12");
			aob.setLoc("hyd");
			Employee eob=new Employee();
			eob.setEmpId(10);
			eob.setEmpName("cpsingh");
			eob.setAobj(aob);
			ses.save(eob);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
