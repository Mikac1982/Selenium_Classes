package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CellByCell_ extends CommonMethods{

	public static void main(String[] args) {
		
		 setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		//number of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		 
		 //number of columns
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		//1. way (easier): ALL CELLS
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for (WebElement cell:cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}
		
		System.out.println("--------------Second Way----------------");
		//2. way (loop through rows and columns)
		for (int i=1; i<=rows.size(); i++) {
			for (int j=1; j<=cols.size(); j++) {
			
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		
		driver.quit();
		
		
		
	}
}
