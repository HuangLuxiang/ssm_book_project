package com.hlx.controller;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hlx.domain.User;
import com.hlx.service.UserService;

@Controller
public class UserController {
	@Resource
    private UserService userService;  
 
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(10000003);  
        mav.addObject("user", user);   
        return mav;    
    }
    
    @RequestMapping("/jsonTest")
    @ResponseBody
    public Map<String, Object> jsonTest() {
    	Map<String, Object> map = new HashMap<String, Object>();
    	User user = new User();
    	user.setUserId(1);
    	user.setUserName("test1");
    	user.setUserPassword("test1");
    	map.put("user", user);
    	return map;
    }
    
    @RequestMapping("/getAllUsers")
    @ResponseBody
    public Map<String, Object> getAllUsers() {
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("userList", userService.selectAllUser());
    	return map;
    }
    
}
