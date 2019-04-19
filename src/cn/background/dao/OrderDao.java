package cn.background.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.Order;

public interface OrderDao {

	List<Order> display(DetachedCriteria dc);

}
