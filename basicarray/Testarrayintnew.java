package com.rays.basicarray;

public class Testarrayintnew {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a[1] = 2;
		a[2] = 3; 
		a[3] = 4;
		a[4] = 5;
		System.out.println(a[1]);
		for (int b:a) {
			System.out.print(b);
		}
	}
}
