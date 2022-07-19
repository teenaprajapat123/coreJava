package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestListMethod {

	public static void main(String[] args) {
		
		List mm = new ArrayList<>();
		mm.add("Meena");
		mm.add(88);
		mm.add("a");
		System.out.println(mm);
		
		List xx = new ArrayList<>();
		xx.add("a");
		xx.add(11);
		xx.add(22);
		xx.add(33);
		System.out.println(xx);
		System.out.println(xx.addAll(2, xx));
		System.out.println(xx.get(3));
		System.out.println(xx.remove(xx));
		System.out.println(xx.size());
		System.out.println(xx.subList(0, 2));
		System.out.println(xx.indexOf("a"));
		System.out.println(xx.lastIndexOf("Meena"));
		
		
	}
}
