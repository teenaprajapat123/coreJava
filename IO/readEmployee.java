package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class readEmployee {


	public static void main(String[] args) throws Exception {
		
		FileInputStream i =new FileInputStream("C:\\Rays\\mohit.txt");
		ObjectInputStream in = new ObjectInputStream(i);
		
		Employee m = (Employee) in.readObject();
		System.out.println(m.getAdd());
		System.out.println(m.getFname());
		System.out.println(m.getLname());
		in.close();
	}
}
