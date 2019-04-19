package cn.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	static {
		//1.���������ļ���
		Configuration cfg = new Configuration().configure();
		//2.����һ��sessionFactory��
		sessionFactory = cfg.buildSessionFactory();
	}
	
	//���session  ---> ���ȫ��session
	public static Session openSession() {
		//3.����session����.Seesion��������JDBC�е�Connection����.
		Session session = sessionFactory.openSession();
		
		return session;
	}
	//���session  ---> ������̰߳󶨵�session
	public static Session getCurrentSession() {
		//3.����session����
		Session session = sessionFactory.getCurrentSession();
		
		return session;
	}
}
