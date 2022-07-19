package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Testcollectionmethod {

	public static void main(String[] args) {
		
		List li = new ArrayList<>();
		li.add(11);
		li.add(11.00);
		li.add("a");
		li.add("java");
		System.out.println(li);
		for (Object ob : li);
		System.out.println(li);
		
	}
}
