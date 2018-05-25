package cn.ycg.shiro.dao;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@description
*@author ycg
*@date Feb 7, 2018
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2129366956629831456L;

	private int id;
	
	private String userName;
	
	private String passWord;
	
	private Set<Role> roles=new HashSet<Role>();

}
