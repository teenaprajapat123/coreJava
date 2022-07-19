package com.rays.IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class writePrimitiveData {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("C:\\Rays\\darbar.dat");
		DataOutputStream d = new DataOutputStream(f);
		d.writeInt(2);
		d.writeBoolean(true);
		d.writeChar('A');
		d.writeDouble(2.2);
		d.close();
		f.close();
		System.out.println("Radha Krishna.....");
	}
}
