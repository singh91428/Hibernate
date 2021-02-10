package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class DeleteData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			String hql="delete from in.nit.model.Student where stuId=?0";
			Query q=ses.createQuery(hql);
			q.setParameter(0, 10);
			int count=q.executeUpdate();
			System.out.println(count);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
