package org.nirmal.learning.springintegration.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
	Logger logger = Logger.getLogger(HelloServiceImpl.class);

	@Override
	public void hello(String name) {
		logger.info("Hello, " + name);
	}

	@Override
	public String getHelloMessage(String name) {		
		return "Hello, " + name;
	}
}
