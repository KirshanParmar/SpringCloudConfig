package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/msg")
	public String getAllMessages() {
		
		System.out.println(env.getProperty("welcome.message"));
		return env.getProperty("welcome.message");
	}

}
