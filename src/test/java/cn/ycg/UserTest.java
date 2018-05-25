package cn.ycg;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.ycg.shiro.dao.User;
import cn.ycg.shiro.mapper.UserMapper;

/**
*@description
*@author ycg
*@date Feb 9, 2018
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("测试开始----");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("测试结束----");
	}

	@Test
	public void test() {
		User user=userMapper.getByUserName("小明");
		System.out.println(user.getPassWord());
		System.out.println("测试！");
	}
}
