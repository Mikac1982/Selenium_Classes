package com.class12_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class BrLinks extends CommonMethods{

	public static void main(String[] args) throws IOException  {
		
		String url="http://Newtours.Demoaut.Com/";
		setUpDriver("chrome", url);	
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		for(WebElement link:links) {
			String linkURL=link.getAttribute("href");
			
			if(linkURL!=null) {
				URL obj=new URL(linkURL);
				
				HttpURLConnection conn=((HttpURLConnection)obj.openConnection());
				
				int rCode=conn.getResponseCode();
				
				if(rCode==200) {
					System.out.println("Valid link "+link.getText());
				}else {
					System.out.println("Invalid link "+link.getText());
				}
			}
				
		}
		driver.quit();	
		
	}
	
	
	
	
}
