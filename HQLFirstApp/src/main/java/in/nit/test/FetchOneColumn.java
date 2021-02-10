package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class FetchOneColumn {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String hql="select empName from in.nit.model.Employee";
			System.out.println(hql);
			Query q=ses.createQuery(hql);
			List<String> output=q.list();
			output.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
