package com.rays.collectionFramework;

import javax.xml.bind.Marshaller;

public class Marksheet implements Comparable<Marksheet> {

	private String fname;
	private String lname;
	private String rollNo;
	private String phy;
	private String che;
	private String mat;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getPhy() {
		return phy;
	}
	public void setPhy(String phy) {
		this.phy = phy;
	}
	public String getChe() {
		return che;
	}
	public void setChe(String che) {
		this.che = che;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	
	}
	@Override
	public int compareTo(Marksheet m) {
		return this. rollNo.compareTo(m.rollNo);
	}
	
}