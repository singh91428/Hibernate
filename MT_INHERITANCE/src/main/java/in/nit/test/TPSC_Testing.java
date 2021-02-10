package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.TPSC_Employee;
import in.nit.model.TPSC_Person;
import in.nit.model.TPSC_Student;
import in.nit.util.HibernateUtil;

public class TPSC_Testing {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			TPSC_Person pobj=new TPSC_Person();
			pobj.setPerId(10);
			pobj.setPerName("cpsingh");
			
			TPSC_Employee eobj=new TPSC_Employee();
			eobj.setPerId(11);
			eobj.setPerName("venky");
			eobj.setEmpSal(49.8);
			eobj.setEmpDept("DEV");
			
			TPSC_Student sobj=new TPSC_Student();
			sobj.setPerId(12);
			sobj.setPerName("Ajeet");
			sobj.setStuFee(47.8);
			sobj.setStuGrd("A+");
			
			ses.save(pobj);
			ses.save(eobj);
			ses.save(sobj);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
