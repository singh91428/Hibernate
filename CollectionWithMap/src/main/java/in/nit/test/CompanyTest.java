package in.nit.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Company;

public class CompanyTest {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			Company co=new Company();
			co.setComId(101);
			co.setComName("NIT");
			co.setAddr("HYD");
			Map<String,Double> mp=new HashMap<>();
			mp.put("p1",1.1);
			mp.put("p2",1.2);
			mp.put("p3",1.3);
			co.setProj(mp);
			ses.save(co);
			tx.commit();
			ses.close();
		} catch (Exception e) {
		}

	}

}
