package cn.background.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.CommentDao;
import cn.background.dao.impl.CommentDaoImpl;
import cn.background.service.CommentService;
import cn.domain.Comment;
import cn.utils.HibernateUtils;

public class CommentServiceImpl implements CommentService {

	private CommentDao dao = new CommentDaoImpl();

	@Override
	public List<Comment> display(DetachedCriteria dc) {
		Session session = HibernateUtils.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		List<Comment> list = dao .display(dc);
		
		return list;
	}

}
