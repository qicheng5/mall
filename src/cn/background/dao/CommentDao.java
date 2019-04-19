package cn.background.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.Comment;

public interface CommentDao {

	List<Comment> display(DetachedCriteria dc);

}
