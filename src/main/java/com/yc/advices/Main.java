package com.yc.advices;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * 1.mybatis启动方式可以在mapper层不需要加mapper注解，但是一定要在启动类的时候加上@mapperScan
 * 2.mybatis在mybatis接口加上@mapper注入mybatis容器，就不需要在启动类的时候加上@mapperScan
 *
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.yc"})	
@MapperScan(basePackages={"com.yc.dao"})
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
