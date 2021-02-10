package in.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Student;

public class TestInsert {
	public static void main(String[] args) {
	try {
		//1. create configuration object
		Configuration cfg=new Configuration();
		//2. load configuration.xml
		cfg.configure();
		//3. build session factory
		SessionFactory  sf=cfg.buildSessionFactory();
		//4. open session factory
		Session ses=sf.openSession();
		//5. begin tx
		Transaction tx=ses.beginTransaction();
		//6. perform save operation 
		Student s=new Student();
		s.setStdId(101);
		s.setStdName("cpsingh");
		s.setStdFee(2000.0);
		ses.save(s);
		//7. commit
		tx.commit();
		ses.close();
		System.out.println("Done");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
