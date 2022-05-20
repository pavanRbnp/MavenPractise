package com.testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeTesting {
	
		@Test
		public void ora_login()
		{
			WebDriverManager.chromedriver().setup();
			System.out.println("start");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			String title = driver.getTitle();
			Assert.assertEquals(title,"OrangeHRM");
			driver.quit();
			
		}
		

}
