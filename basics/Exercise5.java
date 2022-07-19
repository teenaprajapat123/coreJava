package com.rays.basics;

public class Exercise5 {
public static void main(String[] args) {
	int number = 12345; 
	int a = 0;
	while (number > 0) {
		
		a = number % 10; 
		number = number / 10; 
		System.out.print(a);
		
	}
}
}
