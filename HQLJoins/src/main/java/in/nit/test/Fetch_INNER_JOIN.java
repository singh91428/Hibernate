package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class Fetch_INNER_JOIN {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try (ses){
			String hql=" SELECT pob.prodCode,mob.modColor " + 
					" FROM  in.nit.model.Product  pob " + 
					"   INNER JOIN  " + 
					" pob.mobs AS mob ";

			Query q=ses.createQuery(hql);

			List<Object[]> list=q.list();

			for(Object[] ob:list) {
				System.out.println(ob[0]+"-"+ob[1]);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
