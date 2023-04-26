package com.example.demo.controller;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	private static final Logger logger= Logger.getLogger(IndexController.class);
	
	//instance initializer block
	{
		BasicConfigurator.configure();
	}
	@GetMapping("/")
	public String index() {
		logger.debug("loading index page..");
		logger.info("info level message!!");
		logger.warn("WARN level message !!");
		logger.error("Error level message !!");
		logger.fatal("FATAL level message !!");
		logger.trace("TRACE level message!!");
		logger.debug("exit of index(");
		return "index";
	}
}
