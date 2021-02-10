package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.sf.HibernateUtil;

public class EmployeeDelete {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSF().openSession();
			tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpId(103);
			e.setEmpName("vemky");
			e.setEmpSal(78.00);
			ses.delete(e);
			tx.commit();
			ses.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
