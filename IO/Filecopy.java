package com.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Filecopy {
public static void main(String[] args) throws Exception {
	
	String source = "C:\\Rays\\anshul.txt";
	String target = "C:\\Rays\\anshul1.txt";
	
	FileReader reader = new FileReader(source);
	FileWriter writer = new FileWriter(target);
	
	int ch = reader.read();
	
	while (ch != -1) {
		
		writer.write(ch);
		
		ch = reader.read();
		
	}
	writer.close();
	reader.close();
	System.out.println("jaa jakar check kar");
	
	
}
}
	

	