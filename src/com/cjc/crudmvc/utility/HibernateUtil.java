package com.cjc.crudmvc.utility;


import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.mapping.MetadataSource;

import com.cjc.crudmvc.model.Student;
import com.mysql.jdbc.Driver;

public class HibernateUtil
{
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		Map<String,Object> setting = new HashMap<String, Object>();
		setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		setting.put(Environment.URL,"jdbc:mysql://localhost:3306/mvccrud");
		setting.put(Environment.USER,"root");
		setting.put(Environment.PASS,"root");
		setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		setting.put(Environment.SHOW_SQL,"true");
		setting.put(Environment.HBM2DDL_AUTO, "update");
		
		registry=new StandardServiceRegistryBuilder().applySettings(setting). build();
		MetadataSources mds=new MetadataSources(registry)
		.addAnnotatedClass(Student.class);
		Metadata md=mds.getMetadataBuilder().build();
		sessionFactory=md.getSessionFactoryBuilder().build();
		
		return sessionFactory;
		
	}

}
