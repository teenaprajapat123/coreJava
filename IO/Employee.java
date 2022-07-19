package com.rays.IO;

import java.io.Serializable;

import javax.xml.ws.soap.Addressing;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Employee<addressing> implements Serializable {
	
	private int a;
	private String fname;
	private String lname;
	private Addressing add;
	private transient String tempValue;

	
	public Employee() {}
	public  Employee(int a, String fname, String lname) {
		this.a = a;
		this.fname = fname;
		this.lname = lname;
		
		
	}
	public int getA() {
		return a;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public Addressing getAdd() {
		return add;
	}
	public String getTempValue() {
		return tempValue;
	}
	
	
}
