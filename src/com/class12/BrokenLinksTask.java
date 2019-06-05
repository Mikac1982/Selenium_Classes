package com.class12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class BrokenLinksTask extends CommonMethods{
    //go to webPage and find the broken links 
	
	public static void main(String[] args) throws IOException {
		
	String url="http://Newtours.Demoaut.Com/";
	setUpDriver("chrome", url);	
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links: "+links.size());
	
	for(WebElement link:links)	{
		String linkURL=link.getAttribute("href");
		
		if(linkURL!=null) {
			//creating object of URL Class, pass URL
			URL obj=new URL(linkURL);
			//create HttpURLConnection using URL object
			HttpURLConnection connect=((HttpURLConnection)obj.openConnection());
			
			//get and read HTTP response code
			int responseCode=connect.getResponseCode();
			//if HTTP response code is NOT 200 --> link is BROKEN!
			if(responseCode==200) {
				System.out.println("Link is valid-----"+link.getText());
			}else{
				System.out.println("Link is broken----"+link.getText());
			}
		}
	}
			
	driver.quit();
	}
}
