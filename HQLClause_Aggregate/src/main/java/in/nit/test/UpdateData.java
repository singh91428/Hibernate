package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class UpdateData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			String hql="update in.nit.model.Student set stuName=:stuName"
					+ ",course=:course where stuId=:stuId";
			Query q=ses.createQuery(hql);
			q.setParameter("stuId",6);
			q.setParameter("stuName","Ajay");
			q.setParameter("course","MCA");
			int count=q.executeUpdate();
			System.out.println(count+" row is updated");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
