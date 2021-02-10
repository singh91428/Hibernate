package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class TestFetch {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try(ses) {
			String hql="from in.nit.model.Employee";
			Query q=ses.createQuery(hql);
			List<Employee> output=q.list();
			output.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
