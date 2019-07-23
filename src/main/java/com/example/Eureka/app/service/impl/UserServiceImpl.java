package com.example.Eureka.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Eureka.app.entity.User;
import com.example.Eureka.app.mapper.UserMapper;
import com.example.Eureka.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(int i) {
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(i);
		return selectByPrimaryKey;
	}
}
