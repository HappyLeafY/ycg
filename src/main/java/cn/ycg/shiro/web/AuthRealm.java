package cn.ycg.shiro.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import cn.ycg.shiro.dao.Module;
import cn.ycg.shiro.dao.Role;
import cn.ycg.shiro.dao.User;
import cn.ycg.shiro.service.UserService;

/**
*@description
*@author ycg
*@date Feb 8, 2018
*/
public class AuthRealm extends AuthorizingRealm{
	
	@Resource
	private UserService userService;

	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection prin) {
		//获取session中的用户
		User user=(User) prin.fromRealm(this.getClass().getName()).iterator().next();
		List<String> permissionsList=new ArrayList<String>();
		Set<Role> roles=user.getRoles();
		if(roles.size()>0) {
			for(Role role:roles) {
				Set<Module> modules=role.getModules();
				if(modules.size()>0) {
					for(Module module:modules) {
						permissionsList.add(module.getMName());
					}
				}
			}
		}
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		info.addStringPermissions(permissionsList);
		return info;
	}

	//认证登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken uToken=(UsernamePasswordToken) token;
		String userName=uToken.getUsername();
		User user=userService.getByUserName(userName);
		return new SimpleAuthenticationInfo(user,user.getPassWord(),this.getClass().getName());
	}

}
