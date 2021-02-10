package in.nit.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.nit.dao.IStudentDao;
import in.nit.model.Student;
import in.nit.util.HibernateUtil;

public class StudentDaoImpl implements IStudentDao{
	
	public Integer saveStudent(Student s) {
		Session ses=HibernateUtil.getSf().openSession();
		Transaction tx=null;
		Integer id=null;
		try(ses){
			tx=ses.beginTransaction();
			id=(Integer)ses.save(s);
			tx.commit();
		} catch (Exception e) {
			if(tx!=null && tx.getStatus().canRollback()) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public List<Student> getAllStudent() {
		Session ses=HibernateUtil.getSf().openSession();
		List<Student> list=null;
		try(ses){
			String hql="from in.nit.model.Student";
			Query q=ses.createQuery(hql);
			list=q.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
