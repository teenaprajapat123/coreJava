package com.rays.dateandtime;

import java.time.LocalDate;

public class Finderror {

	public static void main(String[] args) {
		
		LocalDate endDate = LocalDate.of(2000, 01, 01);
		LocalDate today = LocalDate.now();
		
		if (endDate.isBefore(today)){
			System.out.println("Error");
		} else {
			System.out.println("not Error");
			
		}
	}
}
