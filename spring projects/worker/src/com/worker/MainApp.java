package com.worker;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.worker.model.Worker;
import com.worker.services.WorkerJDBCTemplate;
import com.worker.helpers.WorkerHelpers;

public class MainApp {

	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		WorkerJDBCTemplate workerJDBCTemplate = context.getBean("workerJDBCTemplate",WorkerJDBCTemplate.class);
	
		Worker worker1 = new Worker(419, "ShowBot", "showbot@gmail.com");
		workerJDBCTemplate.add(worker1);
		
		System.out.println();
		
		List<Worker> listOfWorkers = workerJDBCTemplate.getWorkers(); 
		WorkerHelpers.printAllWorkers(listOfWorkers);
		
		
		Worker worker2 = workerJDBCTemplate.getWorker(2);
		System.out.println(worker2);
	}

}