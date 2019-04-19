package cn.background.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.background.dao.ProductDao;
import cn.background.dao.impl.ProductDaoImpl;
import cn.background.service.ProductService;
import cn.domain.Product;
import cn.utils.HibernateUtils;

public class ProductServiceImpl implements ProductService {

	private ProductDao dao = new ProductDaoImpl();

	@Override
	public List<Product> display() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		List<Product> list = dao .display();
		
		try {
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		
		return list;
	}

	@Override
	public void save(Product product) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			dao.save(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tx.commit();
	}

}
