package com.faryst.authentication;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class MyAuthenticationProvider implements AuthenticationProvider{
	
	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {
		String username = arg0.getName();
		String password = arg0.getCredentials().toString();
	if(username.equals("")) {	
		return new UsernamePasswordAuthenticationToken(username,password,new ArrayList<>());
	}
	else {
		
		return null;
	}
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
