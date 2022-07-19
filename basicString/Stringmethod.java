package com.rays.basicString;

public class Stringmethod {

	public static void main(String[] args) {
		
		String name = "maan bhai";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("h"));
		System.out.println(name.replace("s", "a"));
		System.out.println(name.replaceAll("a", "a"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("maan"));
		System.out.println(name.endsWith("bhai"));
		System.out.println(name.substring(15));
		
	}
}
