package com.class11;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class TaskOne extends CommonMethods{

	public static void main(String[] args) {
		
		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);		
		
		String filePath="/Users/milenasibalic/Desktop/helloOne.txt";
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert);
		alert.accept();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File pic=ts.getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(pic, new File("screenshots/TheInternet/FileUpload.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		
		
		
		
	}
}
