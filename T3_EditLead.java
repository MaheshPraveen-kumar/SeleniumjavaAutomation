package SeleniumBasicsLeafTapTestLeaf;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class T3_EditLead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password'][@class='inputLogin']").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//next page crmsfa
		driver.findElementByXPath("//div[@id='label']").click();
		
		// next page click Lead
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//next page click in FindLead
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		System.out.println("Findlead page Title *******"+driver.getTitle());
		//Enter the name In First name
		
		driver.findElementByXPath("//input[@name='firstName'][@id='ext-gen248']").sendKeys("Hema");
		//store the value in String variable to compare
		String actual=("//input[@name='firstName'][@id='ext-gen248']");
		
		//Click on Find Lead Button
	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
            //get the Title of the current page
	    Thread.sleep(1000);
	    System.out.println("************************************************");
 		System.out.println("while clicking in cell : "+driver.getTitle());
 		System.out.println("************************************************");
		// click on Edit button 
		driver.findElementByXPath("//a[text()='Edit']").click();
		System.out.println("************************************************");
		System.out.println("while clicking in edit button : "+driver.getTitle());
		//check the company name and sleep for 3sec
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']");
		Thread.sleep(3000);
		//clear the company name to edit it
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").clear();
		Thread.sleep(2000);
		//enter new value in company name 
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").sendKeys("TEMENOS");
		//check company name is edited or not to isDisplayed() method to return boolean value
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").isDisplayed();
		
		
		//store the value in variable to compare to string using if statement
		String Updatevalue=("//input[@name='companyName' and @id='updateLeadForm_companyName']");
		driver.findElementByXPath("//input[@class='smallSubmit'and @name='submitButton']").click();
		
		if(actual==Updatevalue)
		{
			System.out.println("Value is not EDITED");
			
		}
		else
		{
			System.out.println("Value is Edited successfully");
		}
//just get the title of the page and close the bowser
		String Title=driver.getTitle();
		System.out.println("The Title of Updated Page is : "+Title);
	Thread.sleep(3000);
	//driver.close();
		}
				
	
		

	

}
