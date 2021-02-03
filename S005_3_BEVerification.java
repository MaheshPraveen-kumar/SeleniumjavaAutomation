package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S005_3_BEVerification {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElementByLinkText("Go to Home Page").click();
		driver.findElementByXPath("//img[@alt='Link']").click();
		//driver.findElement(By.tagName("h5")).findElement(By.linkText("Go to Home Page")).click();
		String attribute = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("it goes to this link: "+attribute);
		String atr = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		System.out.println(atr);
		String text = driver.findElementByLinkText("Go to Home Page").getAttribute("href");
		System.out.println(text);
		
		System.out.println("no.of.link in page: "+driver.findElementsByTagName("a").size());
		List<WebElement> link = driver.findElementsByXPath("//a");
		for (WebElement eachlink : link) {
			System.out.println(eachlink.getAttribute("href"));
			System.out.println(eachlink.getText());
			
		}
		
		
	}

}
