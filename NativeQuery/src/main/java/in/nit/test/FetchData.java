package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class FetchData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String sql="SELECT NAME FROM NATIVEQUERYEMP";
			NativeQuery q=ses.createSQLQuery(sql);
			List<String> l=q.list();
			l.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
