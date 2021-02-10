package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Module;
import in.nit.model.Product;
import in.nit.util.HibernateUtil;;

public class ProductTest {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			Module mobj=new Module();
			mobj.setModId(10);
			mobj.setModName("testing");
			mobj.setModType("Bike");
			Module mobj1=new Module();
			mobj1.setModId(20);
			mobj1.setModName("loading");
			mobj1.setModType("data");
			Module mobj2=new Module();
			mobj2.setModId(30);
			mobj2.setModName("downloding");
			mobj2.setModType("file");
			Product pobj=new Product();
			pobj.setProdId(1);
			pobj.setProdName("BATA");
			pobj.setProdCost(8.9);
			pobj.getMob().add(mobj);
			pobj.getMob().add(mobj1);
			pobj.getMob().add(mobj2);
			ses.save(mobj);
			ses.save(mobj1);
			ses.save(mobj2);
			ses.save(pobj);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
	}
}
