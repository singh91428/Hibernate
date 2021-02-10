package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.ContractMTO;
import in.nit.model.QueteMTO;
import in.nit.util.HibernateUtil;

public class FetchTestingInsert{
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			QueteMTO qob1=new QueteMTO();
			qob1.setQueId(1);
			qob1.setQueAmt(43.0);
			qob1.setQueCode("ABC");
			
			ContractMTO cob=new ContractMTO();
			cob.setConId(10);
			cob.setVendor("Air");
			cob.setRegCode("KLM");
			cob.setQob(qob1);
			
			ContractMTO cob1=new ContractMTO();
			cob1.setConId(20);
			cob1.setVendor("Voda");
			cob1.setRegCode("PQR");
			cob1.setQob(qob1);
			
			ContractMTO cob2=new ContractMTO();
			cob2.setConId(30);
			cob2.setVendor("Voda");
			cob2.setRegCode("STU");
			cob2.setQob(qob1);
			
			ses.save(qob1);
			ses.save(cob);
			ses.save(cob1);
			ses.save(cob2);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}

