package com.class11_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilis.CommonMethods;

public class FileUploadAndScreenshoot extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://the-internet.herokuapp.com";
		setUpDriver("chrome", url);		
		
		click(driver.findElement(By.linkText("File Upload")));
		
		String filePath="/Users/milenasibalic/Desktop/helloOne.txt";
	    driver.findElement(By.cssSelector("input[name='file']")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		
		//verify that file was uploaded
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if(isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File did NOT uploade successfully");
		}
		
		//verify that text of the file uploaded is present
		String expected="helloOne.txt";
		
        String text=driver.findElement(By.cssSelector("div#uploaded-files")).getText();
        System.out.println(text);
		
		if(text.equals(expected)) {
			System.out.println("Expected text is present");
		}else {
			System.out.println("Expected text is NOT present");
		}
		
		
		//STEPS TO TAKE SCREENSHOT:
		
		//1. Downcasting--> convert WebDriver object to the TakeScreenShoot Type
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//2.call getScreenshotAs method
		//we store screenshot, save picture as a file
		//this line will create new file; 
		File pic=ts.getScreenshotAs(OutputType.FILE);
		
		//3. Copy file and past-> we can bring that picture where ever we want and past it(provide location)
		try {                               //location where we want to store file/pic of screenshot
			FileUtils.copyFile(pic, new File("screenshots/TheInternet/FileUpload.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
		
		
		
		Thread.sleep(4000);
    	driver.quit();
	
	}
}
