package SeleniumBasicsLeafTapTestLeaf;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapinput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to set up the chrome the driver
		WebDriverManager.chromiumdriver().setup();
		
		//to open the chrome driver exe we have to import it
		ChromeDriver driver=new ChromeDriver();
		
		// to max the screen
		driver.manage().window().maximize();
		
		// to link the url or to enter the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to enter the username
		WebElement username=driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		
		// to enter the value of the username
		/*
		 * username.sendKeys("demosalesmanager"); Select asp=new Select(username);
		 * System.out.println(asp);
		 */
		
		// to enter the password and its values using Id Locator
		//driver.findElementById("password").sendKeys("crmsfa");
	
		// to enter the password using Name locator and its values
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		
		//using className Locator enter into login page
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//using LinkText Locator copy by inspect the href: Take only the text not link. Text is consider as value 
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		// using ParitalLinkText Loctor it use when ie will change or we won't know the text
	//	driver.findElementByPartialLinkText("sss").click();

		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
	  WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	  
	  Select dropDown= new Select(source);
	  dropDown.selectByIndex(1);
	  
	   WebElement marketingcompain = driver.findElementById("createLeadForm_marketingCampaignId");
	   Select dropDown1=new Select(marketingcompain);
//	   dropDown1.selectByVisibleText("Car and Driver");
	   
	   List<WebElement> options = dropDown1.getOptions();
	   int size=options.size();
	   dropDown1.selectByIndex(size-2);
		
		
	}

}
