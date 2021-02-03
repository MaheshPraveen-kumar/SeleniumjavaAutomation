package XpathUsingLead;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password' and @size='50']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//div[@id='label']").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//Click on FindLead
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Relation Xpath
		
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys("Hema");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		 driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		 
		 driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		 
		 driver.findElementById("createLeadForm_lastName").clear();

		 driver.findElementById("createLeadForm_lastName").sendKeys("devi");
		 
		 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9874563215");
		 
		 driver.findElementByClassName("smallSubmit").click();
		 
		 
		 
		 
	}

}
