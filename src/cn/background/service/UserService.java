package cn.background.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.domain.User;

public interface UserService {

	List<User> display(DetachedCriteria dc);

}
