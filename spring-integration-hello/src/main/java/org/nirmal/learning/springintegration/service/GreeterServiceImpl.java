package org.nirmal.learning.springintegration.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService {
	private static final Logger logger = Logger.getLogger(GreeterServiceImpl.class);

	@Autowired
	private MessageChannel helloWorldChannel;

	@Autowired
	private HelloService helloWorldGateway;

	@Override
	public void greet(String name) {
		helloWorldChannel.send(MessageBuilder.withPayload(name).build());
	}

	@Override
    public void greet2(String name)
    {
		logger.info(helloWorldGateway.getClass());
    	logger.info(helloWorldGateway.getHelloMessage( name )) ;
    }
}