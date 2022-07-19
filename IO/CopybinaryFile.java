package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopybinaryFile {
 public static void main(String[] args) throws Exception {
	
	 String source = "C:\\Users\\Teena\\Pictures\\Camera Roll\\jay shree krishna.jpg";
	 String target ="C:\\Users\\Teena\\Pictures\\Camera Roll\\jay shree ram.jpg";
	 
	 FileInputStream reader =new FileInputStream(source);
	 FileOutputStream writer =new FileOutputStream(target);
	 int ch = reader.read();
	 while (ch != -1) {
		 writer.write(ch);
		 ch = reader.read();
		 
	}
	 writer.close();
	 reader.close();
	 System.out.println(source + " " + target);
	 
	 }
}
