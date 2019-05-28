package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class StaticWebTableDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-table/");	
	
	
	//GET NUMBER OF ROWS   
	List<WebElement> rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
	//to find how many rows in table
	System.out.println("Number of rows: "+rows.size());
	
	System.out.println("---------------ROW DATA---------------");
	Iterator<WebElement> it=rows.iterator();
	while(it.hasNext()) {
		String rowText=it.next().getText();
		System.out.println(rowText);
	}
	
	//for HEADER
	//GET NUMBER OF COLUMNS
	List<WebElement> cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
	System.out.println("Number of columns: "+cols.size());
	
	System.out.println("---------------COLUMNS HEADERS---------------");
	//to get text for each element-column --> just for HEADERS!
	for(WebElement col: cols) {
		String colText=col.getText();
		System.out.println(colText);	
	}
	
	Thread.sleep(2000);
	driver.quit();
	
	}
}
