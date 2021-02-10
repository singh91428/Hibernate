package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.CompositeKey;
import in.nit.model.EmpDatails;
import in.nit.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			CompositeKey ck=new CompositeKey();
			ck.setDeptId(101);
			ck.setEmpId(1);
			CompositeKey ck1=new CompositeKey();
			ck1.setDeptId(102);
			ck1.setEmpId(2);
			CompositeKey ck2=new CompositeKey();
			ck2.setDeptId(103);
			ck2.setEmpId(3);
			EmpDatails e=new EmpDatails();
			e.setEmpName("chandu");
			e.setEmpSal(45.0);
			e.setCpk(ck);
			EmpDatails e1=new EmpDatails();
			e1.setEmpName("ravi");
			e1.setEmpSal(46.0);
			e1.setCpk(ck1);
			EmpDatails e2=new EmpDatails();
			e2.setEmpName("venky");
			e2.setEmpSal(48.0);
			e2.setCpk(ck2);
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
