package com.example.rain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
	
	// Bean Definition
	@Bean
	public String MsgBean() {
		System.out.println("Creating MsgBean......");
		return "Today is very cold climate...Enjoy !!";
	}

}
