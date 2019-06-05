package com.class12;

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
		
	    //storing path of our file property
		String filePath="src/configs/credentials.properties";
		
	    try {
	    	//1. open file through stream
			FileInputStream fis=new FileInputStream(filePath);
		//	fis.close(); if we close stream exception will accure
			
			//2. create object of file input stream
			prop=new Properties();
			//3. load and pass data that comes through stream
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    System.out.println(prop.getProperty("browser"));
	    System.out.println(prop.getProperty("url"));
	    
	    CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
	    CommonMethods.driver.quit();
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
}
