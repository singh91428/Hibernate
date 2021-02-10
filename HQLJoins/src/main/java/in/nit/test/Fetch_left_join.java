package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class Fetch_left_join {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try(ses) {
			String hql=" SELECT pob.prodCode,mob.modColor " + 
					" FROM  in.nit.model.Product  pob " + 
					"   LEFT JOIN  " + 
					" pob.mobs AS mob ";
			Query q=ses.createQuery(hql);
			List<Object[]> list=q.list();
			for(Object[] o:list) {
				System.out.println(o[0]+"--"+o[1]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
