package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import in.nit.util.HibernateUtil;

public class FetchWithId {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			int id=10;
			String sql="select id,name,sal from nativeQueryemp where id=:a";
			NativeQuery nq=ses.createSQLQuery(sql);
			nq.setParameter("a",id);
			List<Object[]> list=nq.list();
			for(Object[] ob:list) {
				System.out.println(ob[0]+" - "+ob[1]+" - "+ob[2]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
