package com.class10_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class DynamicTable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
		setUpDriver("chrome", url);
		
		//login to the application
		//we are calling method that we created from CommonMethods class --> sendText()
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login")).click();

		//get number of rows and columns
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
		System.out.println("Number of rows: "+rows.size());
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[1]/th"));
        System.out.println("Number of columns: "+cols.size());
        
		
		//click on check box next to Susan McLaren
		String expectedValue="Susan McLaren";
		
		for (int i=1; i<=rows.size(); i++) {
			WebElement row=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]"));
			String rowText=row.getText();
			System.out.println("Row "+i+" data is: "+rowText);
			
			//to verify that specific value is in the row
			if(rowText.contains(expectedValue)) {
				//xpath that identify check box
				driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]/td[1]")).click();
				System.out.println("Clicked");
			//	break;
			}
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
