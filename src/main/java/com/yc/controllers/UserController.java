package com.yc.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.JsonModel;
import com.yc.bean.User;
import com.yc.dao.UserDao;

//@Controller

@Api(value="user",tags="用户模块")		//该注解放在类上面，用来表明类中包含作为HTTP接口的方法，该注解的value用来设置接口的前缀

@RestController			//controller的升级版		restful风格	1.返回的都是接送数据，	2.http的请求方法除了get post之外还有put delete......
public class UserController {
	@Autowired
	private UserDao userDao;
	
	
	@ApiOperation(value="用户登录",notes="用户登录")
	//@ApiImplicitParam(name="user",value="User",required=true,dataType="User")
	// @PostMapping("login")	相当于在下面那个RequestMapping里面接了个method="POST"	
	@PostMapping(value="login")
	@ResponseBody
	public JsonModel login(JsonModel json,User user){
		System.out.println("login进来了");
		System.out.println(user);
		try {
			User loginUser=userDao.login(user);
			if(loginUser!=null){
				json.setCode(1);
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("loginUser", loginUser);
				json.setObj(map);
			}else {
				json.setCode(0);
			}
		} catch (Exception e) {
			json.setCode(0);
			json.setMsg(e.getMessage());
			e.printStackTrace();
		}
		return json;
	}
	
	@RequestMapping(value="reg")
	@ResponseBody
//	怎么用form表单提交数据注入对象？
	public JsonModel reg(JsonModel json,User user,HttpServletRequest http){
		String uname=user.getU_name();
		String upassword=user.getU_password();
		if(uname!=null&&uname!=""){
			if(upassword!=null&&upassword!=""){
				try {
					userDao.reg(user);
					json.setCode(1);
				} catch (Exception e) {
					json.setCode(0);
					json.setMsg(e.getMessage());
					e.printStackTrace();
				}
			}else {
				json.setCode(0);
				json.setMsg("密码不能为空。。");
			}
		}else {
			json.setCode(0);
			json.setMsg("用户名不能为空。。");
		}
		return json;
	}
	
	
}
