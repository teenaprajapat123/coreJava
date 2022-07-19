package com.rays.basicString;

public class ReversString {

	public static void main(String[] args) {
		
		String name = "jay shree";	
		char[] resultarray = name.toCharArray();
		for (int a = resultarray.length - 1; a >= 0; a-- ) {
			System.out.println(resultarray[a]);
			System.out.println("*");
	}
}
}