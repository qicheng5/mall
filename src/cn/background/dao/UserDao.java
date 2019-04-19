package cn.background.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.User;

public interface UserDao {

	List<User> display(DetachedCriteria dc);

}
