package com.springbank;

public class TransactionEventListener {
	private void sendSMS(String str) {
		System.out.println(str);
	}
	
	public void onApplicationEvent(WithdrawalEvent event) {
		System.out.print("Withdrawal Event Raised:: ");
		event.msg();
	}

}
