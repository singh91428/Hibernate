package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.EmployeeOTO;
import in.nit.model.PanCardOTO;
import in.nit.util.HibernateUtil;

public class OTOTesting {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			PanCardOTO pan=new PanCardOTO();
			pan.setPanId(1);
			pan.setPanNum("12KM12");
			pan.setPanName("cpsingh");
			PanCardOTO pan1=new PanCardOTO(2,"SK233NK","ajett");
			EmployeeOTO e=new EmployeeOTO(10,"cpsingh",400.0,pan);
			EmployeeOTO e1=new EmployeeOTO(20,"ajeet",500.0,pan1);
			ses.save(pan);
			ses.save(pan1);
			ses.save(e);
			ses.save(e1);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
