package com.rays.basics;

public class Exercise15 {
public static void main(String[] args) {
	int [] a = {12,13,14,15,34,41};
	int b = a [0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>b) {
			b = a [i]; 
			
		}
		
		System.out.println(" Largest no is " + b);
		
	}
}
}
