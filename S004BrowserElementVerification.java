package SeleniumBasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S004BrowserElementVerification {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").submit();
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source3 = driver.findElementById("createLeadForm_industryEnumId");
		Select sour=new Select(source3);
		sour.selectByIndex(3);
		
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select cur=new Select(currency);
		cur.selectByValue("DZD");
		
		String attribute = driver.findElementByName("personalTitle").getAttribute("class");
		System.out.println("the attribute name :" +attribute);
		
		//use Tag Name for getText()
		
		System.out.println(driver.findElementById("createLeadForm_currencyUomId").getText());
		
				
						
	}

}
