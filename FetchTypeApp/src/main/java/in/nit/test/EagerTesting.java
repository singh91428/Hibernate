package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.ContractMTO;
import in.nit.util.HibernateUtil;

public class EagerTesting {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try (ses){
			ContractMTO obj=ses.get(ContractMTO.class,10);
			System.out.println(obj);
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
