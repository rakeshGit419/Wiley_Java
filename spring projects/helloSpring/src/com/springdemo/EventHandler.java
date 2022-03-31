package com.springdemo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class EventHandler implements ApplicationLister<ContextRefreshedEvent>{
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println();
	}
}