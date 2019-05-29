package com.cjc.crudmvc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cjc.crudmvc.daoi.DaoI;
import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.utility.HibernateUtil;

public class Daoimpl implements DaoI {
	SessionFactory SF = HibernateUtil.getSessionFactory();
	List list = new ArrayList<>();;

	@Override
	public void register(Student s) {
		Session session = SF.openSession();
		System.out.println("In Dao");
		session.save(s);
		// System.out.println(i);
		session.beginTransaction().commit();
	}

	@Override
	public List<Student> login(Student s) {

		Session session = SF.openSession();
		String hql = "from Student where username='" + s.getUsername() + "' and password='" + s.getPassword() + "'";
		org.hibernate.Query<Student> q = session.createQuery(hql);
		Student st = (Student) q.uniqueResult();
		//todo Refactor all the deprecated class.
		if (st != null) {
			list = new ArrayList<>();
			list.add(st);
		}else{
			String hql1 = "from Student";
			org.hibernate.Query<Student> q1 = session.createQuery(hql1);

			list = q1.getResultList();
		}
		return list;

	}

	@Override
	public List<Student> delete(Student s) {
		Session session = SF.openSession();
		Transaction t = session.beginTransaction();
		String hql = "delete from Student where rollno=" + s.getRollno() + "";
		Query q = session.createQuery(hql);
		int i = q.executeUpdate();
		System.out.println(i);
		t.commit();
		List<Student> list = null;
		if (i > 0) {
			String hql1 = "from Student";
			Query<Student> q1 = session.createQuery(hql1);
			list = q1.getResultList();

		}
		return list;
	}

	@Override
	public List<Student> update(Student s) {
		List<Student> list = null;
		Session session = SF.openSession();
		String hql = "update Student set name='" + s.getName() + "',username='" + s.getUsername() + "',password='"
				+ s.getPassword() + "'" + " where rollno=" + s.getRollno() + "";
		org.hibernate.Query q = session.createQuery(hql);
		Transaction t = session.beginTransaction();
		System.out.println(hql);
		int i = q.executeUpdate();
		System.out.println(i);
		t.commit();
		if (i > 0) {
			String hql1 = "from Student";
			org.hibernate.Query q1 = session.createQuery(hql1);
			System.out.println(hql);
			list = q1.list();

		}
		return list;

	}

	@Override
	public Student edit(Student s) {
		Session session = SF.openSession();
		System.out.println(s.getRollno());
		String hql = "from Student where rollno=" + s.getRollno() + "";
		Query q = session.createQuery(hql);
		Student s1 = (Student) q.uniqueResult();
		// Student st=s1;
		return s1;
	}

}
