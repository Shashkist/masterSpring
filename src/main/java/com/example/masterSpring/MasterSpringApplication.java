package com.example.masterSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

public class MasterSpringApplication {

	public static void main(String[] args) {

		ApplicationContext ctx;//main interface for spring framework
		ctx = new FileSystemXmlApplicationContext("application-context.xml");
		MyService service = (MyService) ctx.getBean("myService");
		service.doSomething();
	}

}
