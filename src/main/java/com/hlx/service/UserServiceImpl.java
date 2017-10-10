package com.hlx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlx.dao.UserDao;
import com.hlx.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

	@Override
	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}
	
}
