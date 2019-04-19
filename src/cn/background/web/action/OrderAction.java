package cn.background.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.background.service.OrderService;
import cn.background.service.impl.OrderServiceImpl;
import cn.domain.Order;
import cn.utils.HibernateUtils;

public class OrderAction extends ActionSupport implements ModelDriven<Order>{
	private Order order = new Order();
	private OrderService cs = new OrderServiceImpl();
	
	
	public String list() throws Exception {
		String pid = ServletActionContext.getRequest().getParameter("product_id");
		String uid = ServletActionContext.getRequest().getParameter("user_id");
		
		DetachedCriteria dc = DetachedCriteria.forClass(Order.class);
		
		if (StringUtils.isNotBlank(pid)&&!StringUtils.isNotBlank(uid)) {
			Integer id = Integer.valueOf(pid);
			dc.add(Restrictions.like("product_id", id));
		} else if (!StringUtils.isNotBlank(pid)&&StringUtils.isNotBlank(uid)) {
			Integer id = Integer.valueOf(uid);
			dc.add(Restrictions.like("user_id", id));
		} else if (StringUtils.isNotBlank(pid)&&StringUtils.isNotBlank(uid)) {
			Integer id = Integer.valueOf(pid);
			Integer id1 = Integer.valueOf(uid);
			dc.add(Restrictions.like("product_id", id));
			dc.add(Restrictions.like("user_id", id1));
		}
		
		List<Order> list = cs .display(dc);
		
		ActionContext.getContext().put("order", list);
		for (Order order : list) {
			System.out.println(order);
		}
		return SUCCESS;
	}




	@Override
	public Order getModel() {
		return order;
	}

}
