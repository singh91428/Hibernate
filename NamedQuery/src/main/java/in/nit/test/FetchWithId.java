package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class FetchWithId {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			int id=10;
			Query q=ses.createNamedQuery("requered");
			q.setParameter("a",id);
			List<Object[]> l=q.list();
			for(Object[] ob:l) {
				System.out.println(ob[0]+" - "+ob[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
