package com.holy.user.service;

import com.holy.thrift.user.UserInfo;
import com.holy.thrift.user.UserService;
import com.holy.user.mapper.UserMapper;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService.Iface {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserInfo getUserById(int id) throws TException {
		return userMapper.getUserById(id);
	}

	@Override
	public UserInfo getUserByName(String username) throws TException {
		return userMapper.getUserByName(username);
	}

	@Override
	public void regiserUser(UserInfo userInfo) throws TException {
		userMapper.registerUser(userInfo);
	}

}
