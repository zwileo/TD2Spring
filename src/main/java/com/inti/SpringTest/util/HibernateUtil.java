package com.inti.SpringTest.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	

}
