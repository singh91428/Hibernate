package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class FetchAllDetails {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String sql="select * from nativeQueryemp";
			NativeQuery nq=ses.createSQLQuery(sql).addEntity(Employee.class);
			List<Employee> l=nq.list();
			for(Employee e:l) {
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
