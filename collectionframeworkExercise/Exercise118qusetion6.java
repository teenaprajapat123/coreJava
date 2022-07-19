package com.rays.collectionframeworkExercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise118qusetion6 {

	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);

		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
	
			Set w = new HashSet();
			w.add("T");
			w.add("e");
			w.add("e");
			w.add("n");
			w.add("a");
			w.add("M");
			w.add("e");
			w.add("e");
			w.add("n");
			w.add("a");
			

		}
	}
}
