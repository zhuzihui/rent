package com.yc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yc.bean.House;
import com.yc.bean.Page;


/***
 * 	spring boot 直接调用mabatis的sqlSessionFactory功能，需要xml文件与这个Dao接口名字一模一样，且xml文件的<mapper namespace="com.yc.dao.HouseDao">命名需要这样规范起来
 * 	否则调用不到xml文件里面的sql方法
 * @author Hui
 *
 */
@Component
public interface HouseDao {
	public List<House> findAllHouse();
	public void addHouse(House house);
	public void updataHouse(House house);
	public void deleteHouse(House house);
	public int selectCounts();
	public List<House> findPage(Page page);

}
