package SeleniumBasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S005_4BEVerificationRatioButton {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement ids = driver.findElementById("yes");
		ids.click();
		System.out.println(ids.isSelected());
		
		boolean selected = driver.findElementByXPath("//input[@value='1']").isSelected();
		System.out.println(selected);
		
	}

}
