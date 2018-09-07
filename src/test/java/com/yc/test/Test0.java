package com.yc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"beans*.xml"})		//路径有错误，   需要在classpath环境下，若在不同的
public class Test0 {



		@Test
		public void t1(){
			
		}
}
