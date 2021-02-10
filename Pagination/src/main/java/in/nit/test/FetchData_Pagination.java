package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class FetchData_Pagination {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		//Scanner s=new Scanner(System.in);
		try(ses) {
			int ps=3;
			int pno=2;
			String hql="from in.nit.model.Employee";
			Query q=ses.createQuery(hql);
			q.setFirstResult((pno-1)*ps);
			q.setMaxResults(ps);
			List<Employee> emps=q.list();

			for(Employee e:emps) {
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
