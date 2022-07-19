package com.rays.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parsedateformet {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat a =new SimpleDateFormat("dd/MM/yyyy");
		String s ="12/01/2001";
        Date d = a.parse(s);
        System.out.println(d);
	}
}
