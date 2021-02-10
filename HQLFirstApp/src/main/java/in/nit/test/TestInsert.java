package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class TestInsert {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpId(1);
			e.setEmpName("cpsingh");
			e.setEmpSal(3.5);
			Employee e1=new Employee();
			e1.setEmpId(2);
			e1.setEmpName("venky");
			e1.setEmpSal(4.5);
			Employee e2=new Employee();
			e2.setEmpId(3);
			e2.setEmpName("Ajeet");
			e2.setEmpSal(5.5);
			ses.save(e);
			ses.save(e1);
			ses.save(e2);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
