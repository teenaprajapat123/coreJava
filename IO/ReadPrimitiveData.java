package com.rays.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadPrimitiveData {

	public static void main(String[] args) throws Exception {
		
		FileInputStream i = new FileInputStream("C:\\Rays\\darbar.dat");
		DataInputStream d = new DataInputStream(i);
		
		System.out.println(d.readInt());
		System.out.println(d.readBoolean());
		System.out.println(d.readChar());
		System.out.println(d.readDouble());
		d.close();
	}
}
