package cn.background.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.OrderDao;
import cn.domain.Order;
import cn.utils.HibernateUtils;

public class OrderDaoImpl implements OrderDao {

	@Override
	public List<Order> display(DetachedCriteria dc) {
		Session session = HibernateUtils.getCurrentSession();
		
		Criteria c = dc.getExecutableCriteria(session);
		
		return c.list();
	}

}
