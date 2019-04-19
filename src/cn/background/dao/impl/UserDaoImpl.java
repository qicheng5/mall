package cn.background.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.UserDao;
import cn.domain.User;
import cn.utils.HibernateUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> display(DetachedCriteria dc) {
		
		Session session = HibernateUtils.getCurrentSession();
		
		Criteria c = dc.getExecutableCriteria(session);
		
		return c.list();
	}

}
