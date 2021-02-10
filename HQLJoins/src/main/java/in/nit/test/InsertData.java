package in.nit.test;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Model;
import in.nit.model.Product;
import in.nit.util.HibernateUtil;

public class InsertData {

	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			Model m=new Model(1,"RED");
			Model m1=new Model(2,"GREEN");
			Model m2=new Model(3,"BLUE");
			Model m3=new Model(4,"BLACK");
			
			Product p=new Product(11,"PEN",4.0,null);
			Product p1=new Product(12,"BOOK",30.0,Arrays.asList(m1));
			Product p2=new Product(13,"SHAPNER",4.0,null);
			Product p3=new Product(14,"BOX",25.0,Arrays.asList(m2));
			Product p4=new Product(15,"PENCIL",5.0,Arrays.asList(m3));
			
			ses.save(m);
			ses.save(m1);
			ses.save(m2);
			ses.save(m3);
			
			ses.save(p);
			ses.save(p1);
			ses.save(p2);
			ses.save(p3);
			ses.save(p4);
			
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
