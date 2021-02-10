package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Student;
import in.nit.util.HibernateUtil;

public class FetchOrderBy {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String hql="from in.nit.model.Student order by stuName";
			Query q=ses.createQuery(hql);
			List<Student> l=q.list();
			l.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
