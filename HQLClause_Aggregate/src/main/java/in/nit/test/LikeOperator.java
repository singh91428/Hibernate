package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class LikeOperator {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try (ses){
			String hql="select stuName from in.nit.model.Student where stuName like '%T'";
			Query q=ses.createQuery(hql);
			List<String> l=q.list();
			for(String s:l) {
				System.out.println(s);
			}
			String hql1="select stuName from in.nit.model.Student where stuName like '_____'";
			Query q1=ses.createQuery(hql1);
			List<String> l1=q1.list();
			System.out.println();
			l1.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
