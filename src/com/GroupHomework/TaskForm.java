package com.GroupHomework;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class TaskForm extends CommonMethods{
	//go to "http://uitestpractice.com/"
	//click on "Forms" link
	//fill out the entire form
	//close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
	   String url="http://uitestpractice.com/";	
	   setUpDriver("chrome", url);
			
	   click(driver.findElement(By.linkText("Form")));
	   
	   sendText(driver.findElement(By.cssSelector("input#firstname")), "eric");
	   sendText(driver.findElement(By.cssSelector("input#lastname")), "jackson");
	   
	   selectValueRadioButton(driver.findElements(By.cssSelector("label[class*='radio']")), "Single");
	   selectValueCheckBox(driver.findElements(By.cssSelector("label[class*='checkbox']")), "Reading");
	   selectValueDropDown(driver.findElement(By.cssSelector("select#sel1")), "Dominica");	
	   
	   click(driver.findElement(By.id("datepicker")));
	   selectMonth(driver.findElement(By.cssSelector("select[class$='month']")), "Jan");
	   selectYear(driver.findElement(By.cssSelector("select[class$='year']")), "1986");
	   selectDay(driver.findElements(By.xpath("//td[@data-handler='selectDay']")), "26");
	   
	   sendText(driver.findElement(By.cssSelector("input#phonenumber")), "2023334455");
	   sendText(driver.findElement(By.id("username")), "username123");
	   sendText(driver.findElement(By.id("email")), "erikj@gmail.com");
	   sendText(driver.findElement(By.cssSelector("textarea#comment")), "I am very friendly person, i love sport and music");
	   sendText(driver.findElement(By.cssSelector("input#pwd")), "pass999");
	   
       click(driver.findElement(By.xpath("//button[text()='Submit']")));
	   
	   Thread.sleep(6000);
	   driver.quit();
	}
}
