package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.sf.HibernateUtil;

public class EmployeeUpdate {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSF().openSession();
			tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpId(102);
			e.setEmpName("ajeet");
			e.setEmpSal(55.00);
			ses.update(e);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
