package com.testCode;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.devCode.*;

public class LoginTesting {

		@Test
		public void testLogin1() throws IOException
		{
			App a = new App();
			Assert.assertEquals(1, a.login("pavanrbnp","123456"));
		}
		
		@Test
		public void testLogin2() throws IOException
		{
			App a = new App();
			Assert.assertEquals(0, a.login("pavanrbnp","654321"));
		}

}
