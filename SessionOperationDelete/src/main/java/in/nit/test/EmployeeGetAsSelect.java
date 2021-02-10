package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.sf.HibernateUtil;

public class EmployeeGetAsSelect {

	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			Employee e=ses.get(Employee.class,101);
			System.out.println(e);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
