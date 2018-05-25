package cn.ycg.shiro.service;
/**
*@description
*@author ycg
*@date Feb 8, 2018
*/

import cn.ycg.shiro.dao.User;

public interface UserService {
	
	public User getByUserName(String userName);

}
