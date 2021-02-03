package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S005_4CheckBox {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		/*
		 * driver.findElementByLinkText("Java").click(); boolean selected =
		 * driver.findElementByLinkText("Java").isSelected();
		 * System.out.println("First check box is selected or not: "+selected);
		 */
		
		List<WebElement> firstcheckbox = driver.findElementsByXPath("//*[@id=\"contentblock\"]/section/div[1]/label");
		//List<WebElement> firstcheckbox = driver.findElements(By.className("example"));
		for (WebElement web : firstcheckbox) {
			if(!web.isSelected())
			{
				web.click();
			}
			
		}

	}

}
