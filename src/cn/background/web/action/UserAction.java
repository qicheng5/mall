package cn.background.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.background.service.UserService;
import cn.background.service.impl.UserServiceImpl;
import cn.domain.User;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private UserService cs = new UserServiceImpl();

	public String list() throws Exception {
		String id = ServletActionContext.getRequest().getParameter("user_id");
		
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		
		if(StringUtils.isNotBlank(id)) {
			dc.add(Restrictions.like("user_id", id));
		}
		
		List<User> list = cs.display(dc);
		
		ActionContext.getContext().put("user_list", list);
		
		return SUCCESS;
	}
	
	
	@Override
	public User getModel() {
		return user;
	}
}
