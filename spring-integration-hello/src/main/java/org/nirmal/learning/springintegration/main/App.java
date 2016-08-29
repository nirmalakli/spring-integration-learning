package org.nirmal.learning.springintegration.main;


import org.nirmal.learning.springintegration.service.GreeterService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		GreeterService greeterService = applicationContext.getBean("greeterServiceImpl", GreeterService.class);

		greeterService.greet("Spring Integration!");

		applicationContext.close();
	}
}
