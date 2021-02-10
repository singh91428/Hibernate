package in.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class SaveData {
	public static void main(String[] args) {
		Session ses=HibernateUtil.getSF().openSession();
		Transaction tx=null;
		try (ses){
			tx=ses.beginTransaction();
			Employee e=new Employee(1, "cpsingh",25000.0,"dev");
			Employee e1=new Employee(2, "ajeet",21000.0,"web");
			Employee e2=new Employee(3, "akash",27000.0,"db");
			Employee e3=new Employee(4, "venky",28000.0,"dev");
			Employee e4=new Employee(5, "sagar",29000.0,"admin");
			Employee e5=new Employee(6, "koaml",22000.0,"optm");
			Employee e6=new Employee(7, "amar",25000.0,"dev");
			ses.save(e);ses.save(e1);ses.save(e2);ses.save(e3);ses.save(e4);
			ses.save(e5);ses.save(e6);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
