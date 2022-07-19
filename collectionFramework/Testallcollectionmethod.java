package com.rays.collectionFramework;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

public class Testallcollectionmethod {
public static void main(String[] args) {
	List Ll = new ArrayList<>();
	Ll.add(22);
	Ll.add(11.00);
	Ll.add('a');
	Ll.add("java");
	Ll.clear();
	System.out.println(Ll.size());
	
	System.out.println(Ll);
    List pp = new ArrayList<>();
    pp.add(33);
    pp.add(11.00);
    pp.add("java");
    pp.add('a');
    pp.clear();
    System.out.println(pp.size());
    
    System.out.println(pp);
    System.out.println(pp.contains(22));
    System.out.println(Ll.contains(12));
    System.out.println(Ll.remove(0));
    System.out.println(pp.remove("java"));
    System.out.println(Ll.retainAll(pp));
    pp.clear();
    System.out.println(Ll.isEmpty());
    
}
}
