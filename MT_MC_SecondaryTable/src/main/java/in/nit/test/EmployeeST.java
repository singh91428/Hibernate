package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.EmployeeWithSingleST;
import in.nit.sf.HibernateUtil;

public class EmployeeST {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSF().openSession();
			tx=ses.beginTransaction();
			EmployeeWithSingleST e=new EmployeeWithSingleST();
			e.setEmpId(2);
			e.setEmpName("chandu");
			e.setEmpSal(88.8);
			e.setProjName("medical");
			e.setProjLoc("delhi");
			ses.save(e);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
