package com.class11_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
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
	
	String filePath="/Users/milenasibalic/Downloads/Apple.xlsx";
	driver.findElement(By.cssSelector("input#gwt-debug-cwFileUpload")).sendKeys(filePath);
	click(driver.findElement(By.cssSelector("button.gwt-Button")));	
	
	//handling alert
	Alert alert=driver.switchTo().alert();
	//verifying file was uploaded
	String expected="File uploaded!";
	String alertText=alert.getText();
	
	if(expected.equals(alertText)) {
		System.out.println("File was successfully uploaded");
	}else {
		System.out.println("File was NOT successfully uploaded");
	}
	alert.accept();
		
	//2.take screen shoot	
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File pic=ts.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(pic, new File("screenshots/WebTool/Upload2.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Screenshot was not taken");
	}
		
	driver.quit();	

	}
}
