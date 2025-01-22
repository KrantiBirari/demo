package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	 Student s=new Student();
	 //s.setRollno(1);
	// s.setName("ck");
	 //session.persist(s);
	// session.update(s);
	// session.beginTransaction().commit();
	 
	 Student s1=session.get(Student.class,1);
	 session.remove(s);
	 session.beginTransaction().commit();
	 
}
}
