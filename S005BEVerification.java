package SeleniumBasics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S005BEVerification {

	// Browser Element Verification 
	//getAttribute() isDisplayed()
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("rambam@gmail.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
		String text = driver.findElementByName("username").getAttribute("value");
		System.out.println(text);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		//boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isDisplayed();
		System.out.println(enabled);
		

	}

}
