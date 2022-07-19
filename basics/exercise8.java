package com.rays.basics;

public class exercise8 {
public static void main(String[] args) {
	int [][] b = new int [15][15];
	for (int i = 0; i < 11; i++) {
	for (int t = 0; t < 10; t++) {
			b[i][t] = i * t;
			System.out.print(b[i][t]+"      ");
			
		}
		  System.out.println("    "); 
		
	}
	
}
}
