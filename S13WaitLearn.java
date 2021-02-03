package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S13WaitLearn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		/*
		 * driver.findElement(By.linkText("Create New Account")).click();
		 * 
		 * 
		 * WebElement firstname = driver.findElement(By.name("firstname")); WebElement
		 * lastname = driver.findElement(By.name("lastname"));
		 
		
	//	WebDriverWait wait=new WebDriverWait();
	//	wait.until(ExpectedConditions.visibilityOf(element));
		
		sendkeys(driver, firstname, 20, "Edureka");
		sendkeys(driver, lastname, 10, "YouTube");
		Thread.sleep(1000);
		driver.findElementByClassName("_8idr img").click();*/
		WebElement forgotaccount = driver.findElement(By.linkText("Forgotten password?"));
		clickOn(driver, forgotaccount, 10);
		WebDriverWait wait=new WebDriverWait(driver, 20);
	}
	public static void sendkeys(WebDriver driver1,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver1,WebElement element,int timeout)
	{
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
}
