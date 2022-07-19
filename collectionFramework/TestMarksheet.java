package com.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		m1.setRollNo("2");
		m1.setFname("nikita");
		m1.setLname("rathod");
		m1.setPhy("76");
		m1.setChe("55");
		m1.setMat("99");
		
		
		Marksheet m2 = new Marksheet();
		m2.setRollNo("3");
		m2.setFname("meena");
		m2.setLname("ostwal");
		m2.setPhy("88");
		m2.setChe("59");
		m2.setMat("90");
		
		
		Marksheet m3 = new Marksheet();
		m3.setRollNo("4");
		m3.setFname("manju");
		m3.setLname("prajapat");
		m3.setPhy("70");
		m3.setChe("58");
		m3.setMat("97");
		
		Marksheet m4 = new Marksheet();
		m4.setRollNo("5");
		m4.setFname("anshul");
		m4.setLname("prajapat");
		m4.setPhy("75");
		m4.setChe("54");
		m4.setMat("93");
		
		Marksheet m5 = new Marksheet();
		m5.setRollNo("6");
		m5.setFname("arun");
		m5.setLname("mandloi");
		m5.setPhy("76");
		m5.setChe("55");
		m5.setMat("99");
		
		ArrayList ll = new ArrayList();
		ll.add(m1);
		ll.add(m2);
		ll.add(m3);
		ll.add(m4);
		ll.add(m5);
		Collections.sort(ll);
		
		Iterator it = ll.iterator();
		while (it.hasNext()) {
		Marksheet m	= (Marksheet) it.next();
		System.out.println(m.getRollNo() + " " + m.getFname() + " " +
		m.getLname() + " " + m.getPhy() + " " + m.getChe() + " " + m.getMat());
			
		}
		}
	}

