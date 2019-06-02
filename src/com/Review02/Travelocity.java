package com.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class Travelocity extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.travelocity.com/Flights?SEMCID=TRAVELOCITY-US.MULTILOBF.GOOGLE.GT-c-EN.FLIGHT&&SEMDTL=a1752860948.b138198135423.d1277162028531.e1c.f11t2.g1kwd-28170460.h1e.i1.j19007576.k1.l1g.m1.n1&gclid=EAIaIQobChMI9a7rtPfB4gIVE9VkCh0bagcREAAYAiAAEgI1R_D_BwE&gclsrc=aw.ds";
		setUpDriver("chrome", url);
		
		String from="Alexandria, LA (AEX-Alexandria In";
		String to="Dublin, Ireland (DUB)";
		
		sendText(driver.findElement(By.cssSelector("input[id='flight-origin-flp']")), from);
		sendText(driver.findElement(By.cssSelector("input[id='flight-destination-flp']")), to);
		
		sendText(driver.findElement(By.cssSelector("input[id='flight-departing-flp']")), "06/30/2019");
		sendText(driver.findElement(By.cssSelector("input[id='flight-returning-flp']")), "01/15/2020");
		
		click(driver.findElement(By.xpath("//button[@data-gcw-change-submit-text='Search']")));
		
		WebElement elem=driver.findElement(By.cssSelector("div[class='bold announce-able']"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(elem));
		
		boolean present=driver.findElement(By.cssSelector("div[class='bold announce-able']")).isDisplayed();
		System.out.println("Is element present? "+present);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
