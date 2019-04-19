package cn.background.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import cn.background.dao.CommentDao;
import cn.domain.Comment;
import cn.utils.HibernateUtils;

public class CommentDaoImpl implements CommentDao {

	@Override
	public List<Comment> display(DetachedCriteria dc) {
		Session session = HibernateUtils.getCurrentSession();
		
		Criteria c = dc.getExecutableCriteria(session);
		
		return c.list();
	}

}
