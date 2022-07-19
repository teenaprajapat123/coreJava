package com.rays.basics;

public class Exercise16 {
public static void main(String[] args) {
	int [] a = {123,456};
	int b; 
	
	for (int i = 0; i < a.length; i++) {
		for (int t = i; t < a.length; t++) {
			if (a [i] < a [t]) {
				b = a[i];
				a[i] = a [t];
				a[t] = b;
				
			}
			System.out.print(a[1]);
		}
	}
}
}
