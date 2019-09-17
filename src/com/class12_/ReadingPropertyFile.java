package com.class12_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.utilis.CommonMethods;

public class ReadingPropertyFile {

	Properties prop;
	
	@Test
	public void readFile() {
		
		String filePath="src/configs/credentials.properties";
		
		try {
			//1. open input stream and pass file path in constructor
			FileInputStream fis=new FileInputStream(filePath);
			
			//2. create object of Properties class 
			//3. load in data (data that comes through stream)
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//accessing element locators of all web elements 
		System.out.println(prop.getProperty("browser")); //chrome
		System.out.println(prop.getProperty("url"));     //http://google.com
		
		//we didn't extend the class so we have to use CommonMethods class
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		CommonMethods.driver.quit();
		
		
	}
}
