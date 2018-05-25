package cn.ycg.shiro.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ycg.shiro.dao.User;
import cn.ycg.shiro.mapper.UserMapper;
import cn.ycg.shiro.service.UserService;

/**
*@description
*@author ycg
*@date Feb 8, 2018
*/
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	@Override
	public User getByUserName(String userName) {
		
		return userMapper.getByUserName(userName);
	}

}
