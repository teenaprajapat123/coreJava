package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestkeyboardcopyconCommand {

	public static void main(String[] args) throws Exception {
		
		String target = "C:\\Rays\\console.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter printWriter = new PrintWriter(writer);
		
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader ir = new BufferedReader(i);
		
		String line = ir.readLine();
		while (!line.equals("close")) {
			printWriter.println(line);
			line = ir.readLine();
		}
		printWriter.close();
		i.close();
		System.out.println("radha rani.....");
		}
		
	}

