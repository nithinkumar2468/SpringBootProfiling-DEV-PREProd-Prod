package com.springbootprofiling.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Component
public class MyController {
	static int i=0;
	@Value("${message}") //SPEL language
	String msg;

	@GetMapping("/welcome")
	public String getMessage()
	{
		return "Hi "+msg;
		
	}
	@Scheduled(fixedRate=1000)
	public void displaytask(){
		System.out.println("Sending Message="+i);
		i++;
	}
	@Scheduled(cron="10 * * * * *")
	public void displaytask1(){
		System.out.println("Sending Cron Message");
		
	}
}
