package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Student;
import in.nit.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			Student o=new Student();
			o.setStuId(6);
			o.setStuName("VINAY");
			o.setStuFee(3.10);
			o.setCourse("BCA");
			o.setStuDept("BCA");
			ses.save(o);
			Student o1=new Student();
			o1.setStuId(7);
			o1.setStuName("GOURAV");
			o1.setStuFee(4.10);
			o1.setCourse("BTECH");
			o1.setStuDept("MECHNICAL");
			ses.save(o1);
			Student o2=new Student();
			o2.setStuId(8);
			o2.setStuName("SUMIT");
			o2.setStuFee(4.20);
			o2.setCourse("BTECH");
			o2.setStuDept("CIVIL");
			ses.save(o2);
			Student o3=new Student();
			o3.setStuId(9);
			o3.setStuName("KOMAL");
			o3.setStuFee(3.00);
			o3.setCourse("OPTM");
			o3.setStuDept("OPTM");
			ses.save(o3);
			Student o4=new Student();
			o4.setStuId(10);
			o4.setStuName("GUGU");
			o4.setStuFee(3.10);
			o4.setCourse("BCA");
			o4.setStuDept("BCA");
			ses.save(o4);
			tx.commit();
			ses.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
