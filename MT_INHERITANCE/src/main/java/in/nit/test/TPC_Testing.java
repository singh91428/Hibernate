package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.TPC_Employee;
import in.nit.model.TPC_Person;
import in.nit.model.TPC_Student;
import in.nit.util.HibernateUtil;

public class TPC_Testing {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			TPC_Person pobj=new TPC_Person();
			pobj.setPerId(10);
			pobj.setPerName("cpsingh");
			
			TPC_Employee eobj=new TPC_Employee();
			eobj.setPerId(11);
			eobj.setPerName("venky");
			eobj.setEmpSal(49.8);
			eobj.setEmpDept("DEV");
			
			TPC_Student sobj=new TPC_Student();
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
