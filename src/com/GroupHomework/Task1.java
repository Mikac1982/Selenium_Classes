package com.GroupHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{
	//go to "https://jqueryui.com/"
	//click on "Datepicker"
	//select August 10 of 2019
	//verify date "08/10/2019 has been entered successfully 
	//close browser
	
	public static void main(String[] args) throws InterruptedException {
		
        String url="https://jqueryui.com";
		setUpDriver("chrome", url);
		
		click(driver.findElement(By.xpath("//a[text()='Datepicker']")));
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		click(driver.findElement(By.id("datepicker")));
		
	//	WebElement month=driver.findElement(By.xpath("//span[contains(@class,'month')]"));
		String xpath="//span[contains(@class,'month')]";	
		String expectedMonth="August";
		do {
			click(driver.findElement(By.xpath("//span[text()='Next']")));
		}
		while(!driver.findElement(By.xpath(xpath)).getText().equals(expectedMonth));
		
		List<WebElement> cells=driver.findElements(By.xpath("//table[contains(@class,'calendar')]/tbody/tr/td"));
		for (WebElement cell : cells) {
			String cellText=cell.getText();
			if (cellText.equals("10")) {
				click(cell);
			}
		}
		
		WebElement date=driver.findElement(By.cssSelector("input.hasDatepicker"));
		String dateText=date.getAttribute("value");
		
		String expectedDate="08/10/2019";
		if (dateText.equals(expectedDate)) {
			System.out.println("Date "+expectedDate+" was entered successfully");
		}else {
			System.out.println("Date "+expectedDate+" was NOT entered successfully");
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}
