package com.rays.basics;

public class Exercise17 {
public static void main(String[] args) {
	int [] a = {1,2,3,4,5,6,7,8,9};
	int [] b = {1,2,3,4,5,6,7,8};
	
	for (int i = 0; i < a.length; i++) {
		for (int t = 0; t < b.length; t++) {
			if (a [i] == b [t]) {
				break;
				
			}else {
				if (t == (b.length - 1)) {
					System.out.println(a[1]);
					
				}
			}
		}
	}
}
}
