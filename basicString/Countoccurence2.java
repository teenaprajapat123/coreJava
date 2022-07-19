package com.rays.basicString;

public class Countoccurence2 {

	public static void main(String[] args) {
		
		int a = 0;
		String name = "Teena Goverdhn Prajapat";
		for (int i = 0; i < name.length(); i++) {
			for (int t = 0; t < name.length(); t++) {
				if (name.charAt(i) == name.charAt(t)) {
					a++;
				}
			}System.out.println(name.charAt(i)+ "=" +a);
			a = 0;
			
		}
	}
}
