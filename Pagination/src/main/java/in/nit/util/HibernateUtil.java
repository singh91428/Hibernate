package in.nit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null;
	static {
		sf=new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSF() {
		return sf;
	}
}
