package in.nit.test;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.CourseMTM;
import in.nit.model.StudentMTM;
import in.nit.util.HibernateUtil;

public class StdCrsTestMTM {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			CourseMTM cob=new CourseMTM(131,"HIB",200.0);
			CourseMTM cob1=new CourseMTM(132,"SPR",400.0);
			CourseMTM cob2=new CourseMTM(133,"BOOT",400.0);
			
			StudentMTM sob=new StudentMTM();
			sob.setSid(10);
			sob.setSname("A");
			sob.setSmail("a@gmail.com");
			sob.setCobj(Arrays.asList(cob,cob1));
			
			StudentMTM sob1=new StudentMTM();
			sob1.setSid(20);
			sob1.setSname("B");
			sob1.setSmail("b@gmail.com");
			sob1.setCobj(Arrays.asList(cob1,cob2));
			
			ses.save(cob);ses.save(cob1);
			ses.save(cob2);ses.save(sob);
			ses.save(sob1);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
