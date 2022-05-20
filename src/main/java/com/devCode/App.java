package com.devCode;

import java.util.ResourceBundle;

public class App {
	
public int login(String Uname,String pwd)
{
	ResourceBundle rc = ResourceBundle.getBundle("Credentials");
	String userName = rc.getString("username");
	String passWord = rc.getString("password");
	if(userName.equals(Uname) && passWord.equals(pwd))
	return 1;
	else
		return 0;
}
	}
