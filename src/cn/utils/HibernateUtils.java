package cn.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	static {
		//1.加载配置文件：
		Configuration cfg = new Configuration().configure();
		//2.创建一个sessionFactory：
		sessionFactory = cfg.buildSessionFactory();
	}
	
	//获得session  ---> 获得全新session
	public static Session openSession() {
		//3.创建session对象.Seesion对象，类似JDBC中的Connection对象.
		Session session = sessionFactory.openSession();
		
		return session;
	}
	//获得session  ---> 获得与线程绑定的session
	public static Session getCurrentSession() {
		//3.创建session对象
		Session session = sessionFactory.getCurrentSession();
		
		return session;
	}
}
