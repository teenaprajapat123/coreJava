package com.rays.basicString;

public class Countoccurencel {

	public static void main(String[] args) {
		
		String name = "1122334466";
		char search = '4';
		
		int a = 0;
		for (int i = 0; i < name.length(); i++);
		if (name.charAt(a) == search)a++;
		System.out.println("The character" + search + 
				"appears" + a + " times.");
	}
}
