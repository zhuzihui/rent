package com.yc.dao;

import com.yc.bean.User;


/***
 * 	spring boot 直接调用mabatis的sqlSessionFactory功能，需要xml文件与这个Dao接口名字一模一样，且xml文件的<mapper namespace="com.yc.dao.UserDao">命名需要这样规范起来
 * 
 * @author Hui
 *
 */
public interface UserDao {
	public User login(User user);
	public int reg(User user);
}
