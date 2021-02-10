package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.TPCC_Employee;
import in.nit.model.TPCC_Person;
import in.nit.model.TPCC_Student;
import in.nit.util.HibernateUtil;

public class TPCC_Testing {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			TPCC_Person pobj=new TPCC_Person();
			pobj.setPerId(10);
			pobj.setPerName("cpsingh");
			
			TPCC_Employee eobj=new TPCC_Employee();
			eobj.setPerId(11);
			eobj.setPerName("venky");
			eobj.setEmpSal(49.8);
			eobj.setEmpDept("DEV");
			
			TPCC_Student sobj=new TPCC_Student();
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
