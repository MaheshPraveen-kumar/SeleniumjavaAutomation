package XpathUsingLead;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys("Advay");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		//driver.findElementByXPath("//div[@id='ext-gen999']/a").click();
		 driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		 
		 System.out.println("the title of the page: "+driver.getTitle());
		 
		 //click on Edit
		 driver.findElementByXPath("//a[text()='Edit']").click();
		 
		 String text = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getAttribute("value");
		 System.out.println("text value of the company name: "+text);
		 
		String addtext="Classic".concat(text);
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(addtext);
		String updatevalue = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getAttribute("value");
		
		if(updatevalue==text)
		{
			System.out.println("update is failed");
		}else
		{
			System.out.println("update is successfull: "+updatevalue);
		}
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		driver.close();
	}
	

}
