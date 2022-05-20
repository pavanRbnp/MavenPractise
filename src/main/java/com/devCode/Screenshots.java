package com.devCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		TakesScreenshot sc = (TakesScreenshot)driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		byte[] sourFile = sc.getScreenshotAs(OutputType.BYTES);
		driver.quit();
		/*File desti = new File("./MvnShots/googleShot.jpg");
		FileUtils.copyFile(source, desti);*/
		File destiFile = new File("./MvnShots/fbook.jpg");
		FileOutputStream fos = new FileOutputStream(destiFile);
		fos.write(sourFile);
		fos.flush();
		fos.close();
	}

}
