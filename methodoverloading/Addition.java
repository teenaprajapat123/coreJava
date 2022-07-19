package com.rays.methodoverloading;

public class Addition {

	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	
	}
	public void add(float a, float b) {
		System.out.println(a+b);
		
	}
	public void add(float a, float b, float c) {
		System.out.println(a+b+c);
		
	}
}
