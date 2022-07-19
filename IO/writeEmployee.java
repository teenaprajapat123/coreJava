package com.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class writeEmployee {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fs = new FileOutputStream("C:\\\\Rays\\mohit.txt");
		ObjectOutputStream out = new ObjectOutputStream(fs);
		
		Employee em = new Employee(10, "Teena", "prajapat");
		
		out.writeObject(em);
		out.close();
		
		System.out.println("object is successfully persisted");
	}
}
