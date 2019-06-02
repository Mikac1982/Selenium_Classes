package com.class11_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class GoogleDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://google.com");	
		
		//1. converting WebDriver object into TakesScreenshot Type(bigger into smaller)
		TakesScreenshot camera=(TakesScreenshot)driver;
		
		//2. calling method: .getScreenshotAs(OutputType.FILE);
		//   taking screen shoot and store it as a file
		File selfie=camera.getScreenshotAs(OutputType.FILE);
		
		try {
		//3. copy file ->picture of the screen shoot and store it to the location --> new File("")	
			//                                   folder we created 
			FileUtils.copyFile(selfie, new File("screenshots/Google/googlePage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
