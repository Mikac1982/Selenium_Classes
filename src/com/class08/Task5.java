package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task5 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
	   setUpDriver("chrome", "http://demo.guru99.com/test/drag_drop.html");
	   
	   
	   //it is TABLE! not sure how to do it yeat
	   
	   //getting text of the table 
	   String table=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/h3")).getText();
	   System.out.println(table);
	   Thread.sleep(2000);  //DEBIT SIDE
	   
	   //identifying table account 
	   WebElement account=driver.findElement(By.xpath("//table/tbody/tr/td/div[1]"));
	   
	   //???????????????????????????/
	   WebElement bank=driver.findElement(By.xpath("//ol[contains(.,'BANK')]"));
	   driver.switchTo().frame("bank");
	   Thread.sleep(2000);
	
	   Actions action=new Actions(driver);
//	   action.dragAndDrop(account, bank).perform();
	   
	   Thread.sleep(2000);
	   driver.quit();
	   
	   
	   
}
}
