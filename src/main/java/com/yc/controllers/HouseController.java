package com.yc.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.House;
import com.yc.bean.JsonModel;
import com.yc.bean.Page;
import com.yc.bean.PageSet;
import com.yc.dao.HouseDao;

@RestController
public class HouseController {
	
	@Resource(name="houseDao")
	private HouseDao houseDao;
	
	@RequestMapping(value="findAllHouse")
	public JsonModel findAllHouse(JsonModel json){
		System.out.println("findAllHouse进来了");
		try {
			List<House> houseList=houseDao.findAllHouse();
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("houseList", houseList);
			json.setCode(1);
			json.setObj(map);
		} catch (Exception e) {
			json.setCode(0);
			json.setMsg(e.getMessage());
			e.printStackTrace();
		}
		
		return json;
	}
	
	@RequestMapping(value="findAllHouse1")
	public PageSet findAllHouse(PageSet pageset,Page page1){
		try {
			int page=1;
			int pagesize=2;
			int start=0;
			start=(page-1)*pagesize;
			
			int total=houseDao.selectCounts();
			int pagetotal=total/pagesize;
			if((pagetotal*pagesize)<total){
				pagetotal+=1;
			}
			page1.setPagesize(pagesize);
			page1.setStart(start);
			List<House> houseList=houseDao.findPage(page1);
			
			pageset.setCode(1);
			pageset.setList(houseList);
			pageset.setPage(page);
			pageset.setPagesize(pagesize);
			pageset.setPagetotal(pagetotal);
			pageset.setTotal(total);
			
			System.out.println(pageset);
		} catch (Exception e) {
			pageset.setCode(0);
			pageset.setMsg(e.getMessage());
			e.printStackTrace();
		}
		
		return pageset;
	}
}
