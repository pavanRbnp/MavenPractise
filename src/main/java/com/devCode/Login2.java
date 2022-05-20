package com.devCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Login2 {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("Login2Purpose.properties");
		p.load(fis);
		FileOutputStream fos = new FileOutputStream("Login2Purpose.properties");
		p.store(fos, "updated by pavan");
		fis.close();
		fos.close();
	}
}
