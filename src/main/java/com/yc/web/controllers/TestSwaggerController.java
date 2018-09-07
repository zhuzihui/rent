package com.yc.web.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.User;

@Api
@RestController
@RequestMapping(value="/test")		
public class TestSwaggerController {
	
	@ApiOperation(value="展示首页信息",notes="展示首页信息")
	//@ApiImplicitParam(name="user",value="User",required=true,dataType="User")
	@RequestMapping("/show")
	public Object show(User user){
		return "hello world..";
	}
	
	@ApiOperation(value="用户登录",notes="用户登录")
	//@ApiImplicitParam(name="user",value="User",required=true,dataType="User")
	@RequestMapping("/add")
	public Object addUser(User user){
		
		return "success";
	}
}
