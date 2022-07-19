package com.rays.basicarray;

public class Towdarray {

	public static void main(String[] args) {
		
		int [][] a = new int [10][2];
		System.out.println(a.length);
		System.out.println(a [0].length);
		
		int [][] b = new int [20][0];
		b[0] = new int [2];
		b[1] = new int [33]; 
		b[2] = new int [22]; 
		System.out.println(b.length);
		System.out.println(b[0].length);
		for (int [] c : b) {
			System.out.println(c);
			
		}
	}
}
