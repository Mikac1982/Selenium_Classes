package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class FileUploadAndScreenshot extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
	String url="https://the-internet.herokuapp.com";
	setUpDriver("chrome", url);	
		
	driver.findElement(By.linkText("File Upload")).click();	
	
	String filePath="/Users/milenasibalic/Desktop/helloOne.txt";
	driver.findElement(By.id("file-upload")).sendKeys(filePath);		
	driver.findElement(By.id("file-submit")).click();
	
	boolean isDispalyed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
	
	if(isDispalyed) {
		System.out.println("File uploaded successfully");
	}else {
		System.out.println("File did NOT uploade successfully");
	}
	
	//STEPS TO TAKE SCREENSHOT
	//1. downcast webdriver object 
	TakesScreenshot ts=(TakesScreenshot)driver;
	//2. use getScreenshotAs method
	//this line will create new file; save it as a file
	File pic=ts.getScreenshotAs(OutputType.FILE);
	//3. copy file-> we can bring that picture where ever we want and past it(provide location)
	try {
		FileUtils.copyFile(pic, new File("screenshots/TheInternet/FileUpload.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Screenshot was not taken");
	}
	
	
	Thread.sleep(2000);	
//	driver.quit();	
		
	}
}
