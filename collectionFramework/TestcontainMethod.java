package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestcontainMethod {

	public static void main(String[] args) {
		
		List a = new ArrayList<>();
		a.add(10);
		a.add("Teena");
		a.add(3);
		boolean t = a.contains(5);
		System.out.println(t);
		boolean b = a.contains(a);
		System.out.println(b);
	}
}
