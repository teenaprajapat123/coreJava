package com.rays.Therad;


public class TestTherad extends Thread{
		
		private String name;
		public TestTherad() {}
		public TestTherad(String n) {
            name = n;
		}          
		
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println(i+name);//+" "+"Raja");
				System.out.println(i);//+" "+ "rani");
				
			}
			    }
		public static void main(String[] args) {
			TestTherad t1 = new TestTherad("Raja");
			TestTherad t2 = new TestTherad("Rani");
			t1.start();
			t2.start();
		}

		}
				
	    
			
			
			
		
			
		
			
			
		
			
	

