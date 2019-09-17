package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task5 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//Ahead to http://uitestpractice.com/Students/Index
		//Click on the Actions
		//Handle the drag and drop
		//Close the browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://google.com");
//
//		driver.close();
	//	String url="https://google.com";
	//	setUpDriver("gecko",url );
//		
//		System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
//		WebDriver driver = new FirefoxDriver();

		driver.get("http://uitestpractice.com/Students/Index");
	
	//  Dimension dimension=new Dimension(800, 600);
	//	driver.manage().window().setSize(dimension);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=480,620");
		Thread.sleep(3000);
		
//		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		click(driver.findElement(By.xpath("//a[text()='Actions']")));
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		
		Actions act=new Actions(driver);
	//	act.dragAndDrop(drag, drop).build().perform();
		act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		act.contextClick(drag).perform();;
		act.doubleClick().perform();;
		act.moveToElement(drop).perform();
		
		driver.quit();
	}
}
