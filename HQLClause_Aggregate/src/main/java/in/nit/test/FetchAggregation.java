package in.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.nit.model.Student;
import in.nit.util.HibernateUtil;

public class FetchAggregation {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		try {
			String hql="select count(stuId) from in.nit.model.Student";
			Query q=ses.createQuery(hql);
			Object ob=q.uniqueResult();
			Long count=(Long)ob;
			System.out.println("Count no of student "+count);
			
			String hql1="select count(stuId),stuName,stuDept from in.nit.model.Student group by stuDept";
			Query q1=ses.createQuery(hql1);
			List<Object[]> l=q1.list();
			for(Object[] o:l) {
				System.out.println("Output  "+o[0]+"-"+o[1]+"-"+o[2]);
				
			String hql2="select count(stuFee),stuDept from in.nit.model.Student group by stuDept";
			Query q2=ses.createQuery(hql2);
			List<Object[]> l1=q2.list();
			for(Object[] o1:l1) {
				System.out.println(o1[0]+"--"+o1[1]);
			}
			
			String hql3="select max(stuFee) from in.nit.model.Student";
			Query qq=ses.createQuery(hql3);
			Object obj=qq.uniqueResult();
			double max=(Double)obj;
			System.out.println("max sal is = "+max);
			System.out.println();
			System.out.println();
			System.out.println();
			String hqlgb="select count(course),course from in.nit.model.Student group by course";
			Query qu=ses.createQuery(hqlgb);
			List<Object[]> list=qu.list();
			for(Object[] obje:list) {
				System.out.println(obje[0]+"--"+obje[1]);
			}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
