package in.nit.test;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class NamedParam {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String hql="from in.nit.model.Employee where empId=:empId";
			Query q=ses.createQuery(hql);
			q.setParameter("empId",2);
			Object ob=q.uniqueResult();
			Employee e=(Employee)ob;
			System.out.println(e);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
