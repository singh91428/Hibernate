package in.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Employee;

public class EmployeeTabCreate {
	public static void main(String[] args) {
		try {
			//1.create configuration object
			Configuration cfg=new Configuration();
			//2.load configuration file into above object
			cfg.configure("emp.cfg.xml");
			//3. create seesion factory objct which load driver class
			//and create connection
			SessionFactory sf=cfg.buildSessionFactory();
			//4. to perform operation creation one session object using sf
			Session ses=sf.openSession();
			//7. start transection
			Transaction tx=ses.beginTransaction();
			//6. perform operation
			Employee e=new Employee();
			e.setEmpId(101);
			e.setEmpName("chandra");
			e.setJob("manager");
			e.setEmpSal(343.4);
			ses.save(e);
			//7. save data into table
			tx.commit();
			ses.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
