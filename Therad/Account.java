package com.rays.Therad;

public class Account {

	private int balance;
	
	public Account() {
		
	}
		 
	public synchronized void deposit(String nm, int amt) {
		int balance = getBalance() + amt;
		setBalance(balance);
		System.out.println(nm + " " + balance);
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void databaseDelay() {
		try {
			Thread.sleep(200);
	}catch (InterruptedException e) {
		
	}
	
}
	}
