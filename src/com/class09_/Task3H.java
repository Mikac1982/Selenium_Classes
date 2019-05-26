package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class Task3H extends CommonMethods{

	public static void main(String[] args) {
		
		String url="https://the-internet.herokuapp.com/";
        setUpDriver("chrome",url);
        driver.findElement(By.linkText("Dynamic Controls")).click();
        WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
        
        Actions act=new Actions(driver);
        act.moveToElement(element)
                         .click()
                         .sendKeys("Hello")
                         .build()
                         .perform();

        driver.findElement(By.xpath("//button[text()='Disable']")).click();


        WebElement message=driver.findElement(By.id("message"));
       if(message.isDisplayed()) {
           System.out.println(message.getText());
           System.out.println("text is entered successfully");
       }else {
           System.out.println("No message is displayed");
       }


       driver.quit(); 
		
		
		
		
		
	}
}
