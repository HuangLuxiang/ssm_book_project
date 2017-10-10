package com.hlx.service;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hlx.baseTest.SpringTestCase;
import com.hlx.domain.User;

public class UserServiceTest extends SpringTestCase {
	@Autowired 
    private UserService userService; 
 
    @Test 
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10000003);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
    
    @Test 
    public void getAllUsers(){  
        List<User> users = userService.selectAllUser();
        for(User user : users) {
        	System.out.println(user.getUserName() + ":" + user.getUserPassword());
        }
    }  
}
