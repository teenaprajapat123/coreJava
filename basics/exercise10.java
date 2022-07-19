package com.rays.basics;

public class exercise10 {
public static void main(String[] args) {
	int number = 12345678;
	int r;
	int a = 0; 
	int b = 0;
	while (number < 0) {
		r = a % 10;
		a = a / 10;
		b = b +(r*r*r);
	}
	if (a == number) {
		System.out.println("the number is armstrong");
	} else {
		System.out.print("/the number is not armstrong/");
		
	
}
}}
