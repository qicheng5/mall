package cn.background.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.Order;

public interface OrderService {

	List<Order> display(DetachedCriteria dc);

}
