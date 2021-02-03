package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S11Frame {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://dev68594.service-now.com/navpage.do");
		
		// 3 way to switchTo() frame
	/* 
	 *  1. Using id / name of iframe
	 *  2. Using WebElement of the iframe
	 *  3. Using Index
	 
		
	//	1. Using id / name of iframe
	//	driver.switchTo().frame("gsft_main");
	
		// 2. Using WebElement of the iframe
		WebElement elementFrame = driver.findElementById("gsft_main");
		driver.switchTo().frame(elementFrame);
		
		driver.findElementById("user_name").sendKeys("admin");
	*/
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Click Me']").click();
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		// switch to inner Frame 
		driver.switchTo().frame("frame2");
		driver.findElementByXPath("//button[text()='Click Me']").click();
		// it will come out of inner to outer frame
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no.of.frame in page: "+size);
	}

}
