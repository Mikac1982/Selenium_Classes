package com.class11;

import org.openqa.selenium.By;

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

		//we can take screen shoot for each step!
		//first folder where we want to store it, then we name the file as we want
		takeScreenshoot("WebTool", "Login");
		
		//passing folder and file name we want
		String filePath="/Users/milenasibalic/Downloads/cats.jpg";		
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
	
		//taking screen shot calling function we created in common methods class
		takeScreenshoot("WebTool", "Upload4");
		
		
		driver.quit();
		
	}
}
