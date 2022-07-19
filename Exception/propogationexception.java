package com.rays.Exception;


import javax.security.auth.login.LoginException;

public class propogationexception {

	public static void main(String[] args) throws LoginException{
		 auth("Nisha");
	}

	private static void auth(String login) throws LoginException{
		if (login.equals("admin")) {
			LoginException e = new LoginException();
			throw e;
		}
		
	}
}
