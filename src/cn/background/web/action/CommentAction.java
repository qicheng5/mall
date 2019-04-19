package cn.background.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.background.service.CommentService;
import cn.background.service.impl.CommentServiceImpl;
import cn.domain.Comment;

public class CommentAction extends ActionSupport implements ModelDriven<Comment>{

	private Comment comment = new Comment();
	private CommentService cs = new CommentServiceImpl();
	
	

	public String list() throws Exception {
		String pd = ServletActionContext.getRequest().getParameter("product_id");
		
		DetachedCriteria dc = DetachedCriteria.forClass(Comment.class);
		
		if(StringUtils.isNoneBlank(pd)) {
			Integer data = Integer.valueOf(pd);
			dc.add(Restrictions.like("product_id", data));
		}
		
		List<Comment> list = cs .display(dc);
		
		ActionContext.getContext().put("comment", list);
		
		return SUCCESS;
	}



	@Override
	public Comment getModel() {
		return comment ;
	}

}
