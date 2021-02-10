package in.nit.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Customer;

public class CustomerTesting {
	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			Customer cob=new Customer();
			cob.setCustId(102);
			cob.setCustName("gaurav");
			cob.setCusAddr("patna");
			Serializable s=ses.save(cob);
			Integer id=(Integer)s;
			tx.commit();
			ses.close();
			System.out.println("done id is = "+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
