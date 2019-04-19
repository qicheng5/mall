package cn.background.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.UserDao;
import cn.background.dao.impl.UserDaoImpl;
import cn.background.service.UserService;
import cn.domain.User;
import cn.utils.HibernateUtils;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public List<User> display(DetachedCriteria dc) {
		Session session = HibernateUtils.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<User> list = userDao .display(dc);
		
		return list;
	}

}
