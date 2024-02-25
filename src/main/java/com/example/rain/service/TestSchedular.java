package com.example.rain.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedular {
	
	@Scheduled(fixedDelay=3000)
	public void scheduleFixedDelay() {
		Date dt = new Date();
		System.out.println("Fixed Delay Date Time:::" + dt);
	}
	
	
	

}
