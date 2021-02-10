package in.nit.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.SetCollection;

public class SetCollectionTest {
	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			SetCollection ob=new SetCollection();
			ob.setEmpId(102);
			ob.setEmpName("chandu");
			ob.setEmpSal(3999.0);
			Set<String> s=Set.of("NIT","HTC","MNO");
			ob.setProject(s);
			ses.save(ob);
			tx.commit();
			ses.close();
			} catch (Exception e) {
		}
	}
}
