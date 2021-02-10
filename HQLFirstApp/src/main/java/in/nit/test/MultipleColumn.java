package in.nit.test;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import in.nit.util.HibernateUtil;

public class MultipleColumn {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try(ses) {
			String hql="select empId,empName from in.nit.model.Employee ";
			Query q=ses.createQuery(hql);
			List<Object[]> output= q.list();
			for(Object[] ob:output) {
				System.out.println("|"+ob[0]+"-"+ob[1]+"|");   
			}   
		} catch (Exception e) {
			e.printStackTrace();	
			}
	}
}
