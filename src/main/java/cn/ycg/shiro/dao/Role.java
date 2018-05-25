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
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7945110648850647673L;
	
	private int rId;
	
	private String rName;
	
	private Set<Module> modules=new HashSet<Module>();

}
