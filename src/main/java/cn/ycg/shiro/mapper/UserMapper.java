package cn.ycg.shiro.mapper;
/**
*@description
*@author ycg
*@date Feb 7, 2018
*/

import cn.ycg.shiro.dao.User;

public interface UserMapper {
	
	public User getByUserName(String userName);

}
