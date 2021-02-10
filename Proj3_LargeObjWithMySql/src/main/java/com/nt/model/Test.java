package com.nt.model;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		try {
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			Student s=new Student();
			FileInputStream fis=new FileInputStream("D:\\download.jpg");
			byte[] arr=new byte[fis.available()];
			fis.read(arr);
			s.setSid(2);
			s.setSname("ajeet");
			s.setStdimg(arr);
			ses.update(s);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
