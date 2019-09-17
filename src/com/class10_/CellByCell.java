package com.class10_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CellByCell extends CommonMethods{

	public static void main(String[] args) {
		
	    setUpDriver("gecko", "https://the-internet.herokuapp.com/");
	    driver.findElement(By.linkText("Sortable Data Tables")).click();
		
	    //number of rows -->inside body
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		//number of columns -->inside header
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		for (WebElement row:rows) {
			System.out.println(row.getText());
		}
		
		   //how to print value CELL BY CELL?
	    //1. WAY: loop through rows and columns -->indexes!
		    //a) loop through rows
		    //b) loop through all cols
		//  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[rows]/td[cols]")).getText();
				
		for (int i=1; i<=rows.size(); i++) {
			for(int j=1; j<=cols.size(); j++) {
				//returns text of each cells (concatenate specific row and specific column)
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cellText);
			}
		}
		System.out.println("---------------------------------");
		
		//2. WAY:
		//all cells data --> no need for rows(i) and columns(i)
		//you go inside your body,then inside row and do not specify any specific row,just data(td)
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		System.out.println("Number of cells: "+cells.size());
		
		for (WebElement cell:cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}
		
	}
}
