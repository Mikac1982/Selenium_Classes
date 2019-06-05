package com.class12_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilis.CommonMethods;

public class BrokenLinksDemo extends CommonMethods{

	@BeforeMethod
	public void setUp() {
	    setUpDriver("chrome", "http://newtours.demoaut.com/mercuryregister.php");	
		}
	
	@Test
	public void brokenLinksVerification()  {
		//1. grab all the links that are on page
	   List<WebElement> links= driver.findElements(By.tagName("a"));
	   System.out.println("Number of links: "+links.size());
	
	   //2. get href attribute
	   for(WebElement link:links) {
		   String linkURL=link.getAttribute("href");
		   
		try {
			//create URL class
			URL url = new URL(linkURL);
			//opening connection and convert to Http connection
	        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
	        //get response code
	        int code=conn.getResponseCode();
	        if(code==200) {
	        	System.out.println("Link is valid: "+link.getText());
	        }else {
	        	System.out.println("Link is NOT valid: "+link.getText());
	        }
	        
	    }catch (Exception e) {
				e.printStackTrace();
			}
			
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}
