package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Sortable Data Tables” link
	//Verify tables consist of 4 rows and 6 columns
	//Print name of all column headers
	//Print data of all rows
	
	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Number of rows: "+rows.size());
		System.out.println("---------------ROW DATA---------------");
		
		for (WebElement row: rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("Number of columns: "+cols.size());
		System.out.println("---------------COLUMN DATA---------------");
		
		Iterator<WebElement> it=cols.iterator();
		while(it.hasNext()) {
			String colText=it.next().getText();
			System.out.println(colText);
		}
		
		driver.quit();
	}
}
