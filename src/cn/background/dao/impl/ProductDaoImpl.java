package cn.background.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import cn.background.dao.ProductDao;
import cn.domain.Product;
import cn.utils.HibernateUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> display() {
		Session session = HibernateUtils.getCurrentSession();
		
		Criteria c = session.createCriteria(Product.class);
		List list = c.list();
		return list;
	}

	@Override
	public void save(Product product) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(product);
	}

}
