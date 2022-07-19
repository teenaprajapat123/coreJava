package com.rays.dateandtime;

import java.sql.Date;
import java.util.Calendar;

public class Mantainance {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		for (int a = 0; a<= 12; a++) {
			c.add(Calendar.DATE, 30);
			System.out.println(c.getTime());
		}
	}
}
