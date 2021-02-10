package in.nit.test;

import org.hibernate.Session;

import in.nit.model.Product;
import in.nit.util.HibernateUtil;

public class FetchTestingGet {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try (ses){
			Product p=ses.get(Product.class,1);
			System.out.println(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
