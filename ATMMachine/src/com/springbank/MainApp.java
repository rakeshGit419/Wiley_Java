package com.springbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   	  
	      SavingsAccount t1 = (SavingsAccount) context.getBean("savingsacc");
	      System.out.println(t1);
	      
	      SalaryAccount t2 = (SalaryAccount) context.getBean("salaryacc");
	      System.out.println(t2);
	      
	      WithdrawalEventPublisher t3 = (WithdrawalEventPublisher) context.getBean("withdrawalEventPublisher");
	      	double amount = 100000;
	      
	      
			if(t1.accBalance != t1.withdraw(amount)) {
				t3.publish(amount, t1);
			}
			
			if(t2.accBalance != t2.withdraw(amount)) {
				t3.publish(amount, t2);
			}
			System.out.println(t1);
			System.out.println(t2);
	}

}
