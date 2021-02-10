package in.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Employee;

public class EmployeeTabInsert {
	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("empinsert.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpId(103);
			e.setEmpName("sagar");
			e.setJob("doctor");
			e.setEmpSal(400.25);
			ses.save(e);
			tx.commit();
			ses.close();
			System.out.println("Done saving data into DB table emptab");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
