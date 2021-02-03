package SeleniumBasicsLeafTapTestLeaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1_CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		System.out.println(driver.getCurrentUrl());
	
		
		driver.findElementById("accountName").sendKeys("kumar");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		driver.findElementByName("groupNameLocal").sendKeys("Praveen");
		driver.findElementByName("officeSiteName").sendKeys("this is my site");
		Thread.sleep(1000);
		driver.findElementById("annualRevenue").sendKeys("2000");
		
		Thread.sleep(1000);
		WebElement instrudy = driver.findElementByName("industryEnumId");
		Select dropdown= new Select(instrudy);
		dropdown.selectByValue("IND_SOFTWARE");
		
		
		
		  WebElement owner = driver.findElementByName("ownershipEnumId");
		  Select dropdown2= new Select(owner);
		  dropdown2.selectByVisibleText("S-Corporation");
		  
		  WebElement srce = driver.findElementByName("dataSourceId"); 
		  System.out.println("what is there in srce object: "+srce);
		  Select dropdown4= new Select(srce); 
		  System.out.println("From select class : "+dropdown4);
		  Thread.sleep(3000);
		  dropdown4.selectByVisibleText("Employee");
		  
		  
		  WebElement state = driver.findElementByName("generalStateProvinceGeoId");
		  Select dropdown3= new Select(state); 
		  dropdown3.selectByValue("TX");
		 
	
		

		driver.findElementByClassName("smallSubmit").click();
		
		System.out.println("current Url: "+driver.getCurrentUrl());
		System.out.println("Current Page Title: "+driver.getTitle());
		driver.close();
		

	}

}
