package cn.background.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.Comment;

public interface CommentService {

	List<Comment> display(DetachedCriteria dc);
	
}
