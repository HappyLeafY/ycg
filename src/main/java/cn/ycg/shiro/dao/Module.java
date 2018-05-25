package cn.ycg.shiro.dao;

import java.io.Serializable;
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
public class Module implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1784006214412350626L;
	
	private int mId;
	
	private String mName;
	
	private Set<Role> roles;

}
