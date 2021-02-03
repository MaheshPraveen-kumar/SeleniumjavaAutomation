package SeleniumBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S008WebTable 
{

	private static final String Interger = null;

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		
		// static web table
		/*
		 * WebElement elementfirs =
		 * driver.findElementByXPath("//table[@id='table_id']//tr[2]/td[1]"); String
		 * text = elementfirs.getText(); System.out.println(text);
		 */
		
		// i want to print first row then use forLoop
	/*	for (int i = 2; i <=5; i++) {
																				// Dynamic xpath
			WebElement elementfirs = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]");
			String text = elementfirs.getText();
			System.out.println(text);

		} */
		
		// for Static table dynmamic row
		// List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		 
		
	 /*	for (int i = 2; i <=rows.size(); i++) 
		{
			// Dynamic xpath
			WebElement elementfirs = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]");
			String text = elementfirs.getText();
			System.out.println(text);

		}*/
		
		// for static table dynamic row and columns
	/*	int columns = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td").size();
		System.out.println("no.of.rows in table   : "+rows.size());
		System.out.println("no.of.columns in table: "+columns);
		int a[]=new int[columns];
		int markClick;
		for (int i = 2; i <=rows.size(); i++) 
		{
			for (int j = 1; j <=columns; j++) 
			{
						
				// Dynamic xpath
				WebElement element = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
				
							
			}
			
		} */
		
		 List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		 List<WebElement> colums = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
		 System.out.println("no.of.rows in table   : "+rows.size());
		 System.out.println("no.of.columns in table: "+colums.size());
		 
		 // getting a progress values 
		 String progress = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		 System.out.println("progress value: "+progress);
		 
		 //least completed progress 
		  
		 ArrayList<Integer> newval = new ArrayList<Integer>();
		 for (int i = 2; i< rows.size(); i++) 
		 {
			 String percentage_value = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]").getText();
			 int least_no=Integer.parseInt(percentage_value.replaceAll("[^0-9]", ""));
			 newval.add(least_no);
			
		}	
		// Arrays.sort(newval);
		 Collections.sort(newval); 
		 System.out.println("smallest values: "+newval.get(0));
		 driver.findElementByXPath("//td[text()='"+newval.get(0)+"%']/parent::tr//td[3]/input").click();
		 
		 
		
	}

}
