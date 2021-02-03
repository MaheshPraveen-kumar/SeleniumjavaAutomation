package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S003SelectDropDown {

	public static void main(String[] args) {
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
		
		//For DropDown
		//1. to identify the DropDown
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		//use select class
		Select dropDown=new Select(source);
		
		// There are 3 method to select the value
		//1. VisibleText = SelectByVisbleText()
		//2. Value       = SelectByValue()
		//3. Index       = SelectByIndex()
		//black color text is Visible Text
		
		//dropDown.selectByVisibleText("Employee");
		
		
		//dropDown.selectByValue("LEAD_PR");
		
		
		dropDown.selectByIndex(5);
		
		WebElement source2 = driver.findElementByName("marketingCampaignId");
		Select sel=new Select(source2);		
		sel.selectByValue("CATRQ_CAMPAIGNS");
		
		/*
		 * WebElement source3 = driver.findElementById("createLeadForm_industryEnumId");
		 * Select sour=new Select(source3); sour.selectByIndex(3);
		 */
		
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select cur=new Select(currency);
		cur.selectByValue("DZD");
		
		// to select the all value from drop down 
		
		WebElement dd = driver.findElementById("createLeadForm_industryEnumId");
		
		Select Ind=new Select(dd);
		
		List<WebElement> list = Ind.getOptions();
		
		// to select the index without using SelectByIndex()
		//get(index no);
	//	list.get(1);
		
		// to get the size of the drop down use SIZE()
		int size = list.size();
		
		System.out.println("size of the Industry dropdown: "+size);
		
		// to select all the value from drop down use forloop()
		for (int i = 0; i < size-1; i++) 
		{
			list.get(i).click();
		}
		
	}

}
