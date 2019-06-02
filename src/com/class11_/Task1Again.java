package com.class11_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class Task1Again extends CommonMethods{
 /*
    Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
    Upload file
    Verify file got successfully uploaded and take screenshot 
  */

	public static void main(String[] args) {
		
	String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
	setUpDriver("chrome", url);
		
	String filePath="/Users/milenasibalic/Downloads/cats.jpg";
	driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);	
	driver.findElement(By.cssSelector("button.gwt-Button")).click();		
		
	String expected="File uploaded!";
	String actualText=getAlertText(); //function/method we created --> common methods class
	
	if(actualText.equals(expected)){
		System.out.println("File is uploaded");
	}else {
		System.out.println("File is NOT uploaded");
	}
	acceptAlert();
	
	//screenshot:
	//1. downcasting--> convert driver to TakeScreenshoot Interface	
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File pic=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(pic, new File("screenshots/WebTool/Upload3.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Unable to take screen shot");
	}	
		
	driver.quit();	
		
	}
}
