package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CellByCell extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
        setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		//number of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		//number of columns
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		for (WebElement r:rows) {
			System.out.println(r.getText());
		}
		
		//how to print value CELL BY CELL
		//1. loop through rows
		//2. loop through all cols
	    //	driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		//1. WAY: loop through rows and columns
		for (int i=1; i<=rows.size(); i++) {
			for (int j=1; j<=cols.size(); j++) {
				//returns text of each cells
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		
		//2. WAY:
		//all cells --> no need for rows(i) and columns(i)
		System.out.println("--------------------------");
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for (WebElement cell: cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
