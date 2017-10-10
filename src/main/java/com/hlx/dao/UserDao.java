package com.hlx.dao;

import java.util.List;

import com.hlx.domain.User;

public interface UserDao {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);
	
	/**
	 * 
	 * @return
	 */
	public List<User> selectAllUser();
}
