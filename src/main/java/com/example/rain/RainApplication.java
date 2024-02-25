package com.example.rain;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class RainApplication {

	public static void main(String[] args) {
		System.out.println("Settings properties file....");
		//System.setProperty("spring.config.name", "web.properties");
		SpringApplication.run(RainApplication.class, args);
	}

}








