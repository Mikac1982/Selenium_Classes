 package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{
   /*
     Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
     Upload file
     Verify file got successfully uploaded and take screenshot 
   */
	
	public static void main(String[] args) {
	
	String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
	setUpDriver("chrome", url);	

	//passing folder and file name we want
	takeScreenshoot("WebTool", "Login");
	
	String filePath="/Users/milenasibalic/Desktop/helloOne.txt";		
	driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
	
	takeScreenshoot("WebTool", "Upload1");
	
	driver.findElement(By.cssSelector("button.gwt-Button")).click();	
	
	String expected="File uploaded!";
	//we have to get text of alert to verify if file is uploaded
	//we call our common method for alert
	String textActual=getAlertText();
	
	if(textActual.equals(expected)) {
		System.out.println("File is uploaded");
	}else {
		System.out.println("File is NOT uploaded");
	}
	acceptAlert();
	
	
	//screenshot
	//1. downcasting--> convert driver to TakeScreenshoot Interface
	TakesScreenshot ts=(TakesScreenshot)driver;
	//2. method getScreenshootAS
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	try {
	//3. copy file and handle exception
		FileUtils.copyFile(src, new File("screenshots/WebTool/Upload.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Screenshot was not taken");
	}
	
	driver.quit();
	
	}
}
