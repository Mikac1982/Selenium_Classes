package com.Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class ClickEdit extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome","https://the-internet.herokuapp.com/tables");

		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		String client="Doe";
		
		for(int i=1; i<rows.size(); i++) {
			                                                                     //if i=3
			String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]")).getText();
			
			if(text.equals(client)) {
				                                    //selecting link1 which is edit
				driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td/a[1]")).click();
				System.out.println("Click edit");
			}
		}
	
		Thread.sleep(3000);
	//	driver.quit();
		
		
	}
}
