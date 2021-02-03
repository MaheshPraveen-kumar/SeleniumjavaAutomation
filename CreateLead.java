package XpathUsingLead;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @size='50']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//div[@id='label']").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		// company Name:
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Rumon");
		//First Name:
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Advay");
		//Last Name:
		driver.findElementByXPath("//input[@id='createLeadForm_lastName' and @name='lastName']").sendKeys("Saro");
		
		//source dropdown
		WebElement Source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		
		Select dropdown=new Select(Source);
		
		dropdown.selectByIndex(2);
		
		//marketing dropdown
		WebElement MarketingCamp = driver.findElementByXPath("//select[@name='marketingCampaignId']");
		
		Select dd1=new Select(MarketingCamp);
		
		dd1.selectByValue("CATRQ_AUTOMOBILE");
		
		//Industry
		WebElement industry = driver.findElementByXPath("//select[@name='industryEnumId']");
		Select dd2=new Select(industry);
		List<WebElement> options = dd2.getOptions();
		int size = options.size();
		dd2.selectByIndex(size-1);
		
		//Ownership
		WebElement owner = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
		Select dd3=new Select(owner);
		dd3.selectByVisibleText("S-Corporation");
		
		//phone Number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9874563215");
		
		//country
		WebElement country = driver.findElementByXPath("//select[@id='createLeadForm_generalCountryGeoId']");
		Select dd4=new Select(country);
		dd4.selectByValue("IND");
		
		//submit button
		driver.findElementByXPath("//input[@name='submitButton']").click();
		System.out.println("The Current Url: "+driver.getCurrentUrl());
		System.out.println("The Current title: "+driver.getTitle());
		
	//	driver.close();
		
	}

}
