package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpId(10);
			e.setEmpName("cpsingh");
			e.setEmpSal(123.44);
			Employee e1=new Employee();
			e1.setEmpId(11);
			e1.setEmpName("ajeet");
			e1.setEmpSal(1654.44);
			Employee e2=new Employee();
			e2.setEmpId(12);
			e2.setEmpName("venky");
			e2.setEmpSal(1654.44);
			ses.save(e);
			ses.save(e1);
			ses.save(e2);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
	}

}
