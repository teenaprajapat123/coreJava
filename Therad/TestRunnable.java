package com.rays.Therad;

public class TestRunnable implements Runnable {
	private String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			
			
			
			System.out.println(i+name);
		}
		
	}
	public TestRunnable(String name) {
		this.name = name;
	
}

	public static void main(String[] args) {
		 Thread t1 = new Thread(new TestRunnable("Raja"));
		 Thread t2 = new Thread(new TestRunnable("Rani"));
		 t1.start();
		 t2.start();
	}

}
