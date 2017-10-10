package com.hlx.service;

import java.util.List;

import com.hlx.domain.User;

public interface UserService {
	public User selectUserById(Integer userId);
	
	public List<User> selectAllUser();
}
