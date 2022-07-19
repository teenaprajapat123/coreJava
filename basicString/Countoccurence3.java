package com.rays.basicString;

public class Countoccurence3 {

	public static void main(String[] args) {
		
		int s = 0;
	    String name = "jay shree krishna";
	    for (int i = 0; i < name.length(); i++) {
	    	for (int t = 0; t < name.length(); t++) {
	    		if (name.charAt(i) == name.charAt(t)) {
	    			s++;
	    			
	    		}
	    	}System.out.println(name.charAt(i)+ "=" +s);
	    	   s++;
	    }
	}
}
