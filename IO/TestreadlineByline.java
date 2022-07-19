package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class TestreadlineByline {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Rays\\teena.txt");
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		
		while (line !=  null) {
			System.out.println(line);
			line = br.readLine();
			
		}
			reader.close();
			
		}
		
	}

