package com.Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class TablePractice extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome","https://the-internet.herokuapp.com/tables");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(rows.size());
	//	for (WebElement row:rows){
	//		String rowText=row.getText();
	//		System.out.println(rowText);
	//		if(rowText.equals("Smith")) {
	//			System.out.println("Validation");
	//		}
	//	}
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(list.size());
		for (int i = 1; i <= list.size(); i++) {
			if (i >= 6) {
				String text = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th[" + i + "]")).getText();
				System.out.println(text.equals("Printer"));
			} else {
				System.out.println("fail");
			}
		}
		
		driver.quit();
	}
}
