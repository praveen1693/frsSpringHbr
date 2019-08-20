package com.frs.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.frs.springmvc.model.User;

@Repository("userDao")
public class UserDAOImpl extends AbstractDao<Integer, User> implements UserDAO {

	@Override
	public void saveUser(User user) {
		persist(user);
		
	}

}
