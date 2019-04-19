package cn.background.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.OrderDao;
import cn.background.dao.impl.OrderDaoImpl;
import cn.background.service.OrderService;
import cn.domain.Order;
import cn.utils.HibernateUtils;

public class OrderServiceImpl implements OrderService {

	private OrderDao dao = new OrderDaoImpl();

	@Override
	public List<Order> display(DetachedCriteria dc) {
		Session session = HibernateUtils.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Order> list = dao .display(dc);
		
		try {
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
