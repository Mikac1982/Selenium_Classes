package com.class12_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class BrokenLinksAgain extends CommonMethods{

	public static void main(String[] args) throws IOException {
		
		
		String url="http://Newtours.Demoaut.Com/";
		setUpDriver("chrome", url);	
		
		//1.collect ALL links on WebPage with tag a
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+links.size());
		
		//2.loop through each link and get a href attribute 
		for (WebElement link:links) {
			String URLlink=link.getAttribute("href");
		
		//3.if URLlink is not null, create object of URL class(pass URLlink as parameter)
			if(URLlink!=null){
				URL obj=new URL(URLlink);
				
		//4.open connection and convert to HttpURLConnection class 
				HttpURLConnection conn=((HttpURLConnection)obj.openConnection());
		//5.get response code		
				int rcode=conn.getResponseCode();
		//6.if response code is 200, link is valid, else link is BROKEN!		
				if(rcode==200) {
					System.out.println("Link is valid: "+link.getText());
				}else {
					System.out.println("Link is broken : "+link.getText());
				}
			}
		}
		driver.close();
		
		
		
		
		
		
		
		
	}
}
