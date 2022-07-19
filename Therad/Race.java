package com.rays.Therad;

public class Race extends Thread {

	public static Account data = new Account();

	public Race(String name) {
		super(name);

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			data.deposit(getName(), 1000);

		}

	}

	public static void main(String[] args) {
		Race r1 = new Race("maa");
		Race r2 = new Race("Papa");
		r1.start();
		r2.start();
	}

}
