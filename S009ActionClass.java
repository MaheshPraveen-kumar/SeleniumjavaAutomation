package SeleniumBasics;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S009ActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		
				driver.get("https://www.snapdeal.com/");
				Thread.sleep(1000);
				driver.findElementById("pushDenied").click();
				// driver.findElementByXPath("//div[@class='leftNavigationLeftContainer expandDiv']/ul/li[7]/a/span").click();;
				WebElement men = driver.findElementByXPath("//div[@class='leftNavigationLeftContainer expandDiv']/ul/li[7]/a/span");
				
				//driver.findElementByXPath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span").click();
				WebElement items = driver.findElementByXPath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span");
				//Thread.sleep(1000);
				
				
				  Actions builder=new Actions(driver);
				  //builder.clickAndHold(men).moveToElement(items).release().perform();
				  builder.moveToElement(men).moveToElement(items).click().perform();
				
				 
				//builder.contextClick(element);
			

		
		/*
		 * driver.get("http://www.leafground.com/pages/selectable.html");
		 * 
		 * WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 * WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		 * Actions builder=new Actions(driver);
		 * builder.clickAndHold(item1).moveToElement(item4).release().perform();
		 */
	 	
		/*
		 * WebElement source = driver.findElementById("draggable"); WebElement targ =
		 * driver.findElementById("droppable"); Actions builder=new Actions(driver);
		 * builder.dragAndDrop(source, targ).perform();
		 */
		//WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Selenium']");
		//WebElement appium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Appium']");
	//	Actions builder=new Actions(driver);
	//	builder.keyDown(Keys.CONTROL).click(selenium).click(appium).keyUp(Keys.CONTROL).perform();
		
		
		
		/*	driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElementByXPath("//a[text()=Men]");
		
		Actions builder=new Actions(driver);
		
		//builder.moveToElement(men).perform();
		builder.contextClick(men).perform();  */

	}

}
