package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class PositionalParam {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String hql="from in.nit.model.Employee where empId=?0";
			Query q=ses.createQuery(hql);
			q.setParameter(0,2);
			Object ob=q.uniqueResult();
			Employee e=(Employee)ob;
			System.out.println(e);
			/*
			 * String hql1="from in.nit.model.Employee where empId<?0"; Query
			 * q1=ses.createQuery(hql1); q1.setParameter(0,3); List<Employee> l=q1.list();
			 * l.forEach(System.out::println);
			 */
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
