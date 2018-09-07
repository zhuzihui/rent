package com.yc.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket createRestAPI(){
		return new Docket(DocumentationType.SWAGGER_2)
		.apiInfo(apiInfo())
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.yc.controllers"))	//扫描该包下面所有类的方法到swagger页面显示出来
		.paths(PathSelectors.any())
		.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
		.title("项目相关信息")
		.description("以下接口是操作用户的相关信息")
		.version("1.0")
		.build();
	}
}
