package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
  AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
  HelloWorld obj = (HelloWorld) context.getBean("helloWorld",HelloWorld.class);
  obj.getMessage();
  
	   }
	}