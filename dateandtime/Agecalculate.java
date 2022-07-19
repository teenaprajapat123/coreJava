package com.rays.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class Agecalculate {

	public static void main(String[] args) {
		
	   LocalDate today = LocalDate.now();
	   LocalDate employeebirthday = LocalDate.of(2000, 01, 01);
	   Period diffrent = Period.between(employeebirthday, today );
	   System.out.println(diffrent.getYears() +  " years ");
	   System.out.println(diffrent.getMonths() + " months ");
	   System.out.println(diffrent.getDays()+ " Days ");
	   
	}
}
