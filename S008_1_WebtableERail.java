package SeleniumBasics;

import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Exit;

public class S008_1_WebtableERail {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		//to uncheck sort on date
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(1500);
		int size = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		System.out.println(size);
		List<String> listTrainNames = new ArrayList<String>();
		
		
		for (int i = 1; i <= size; i++) 
		{
			
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
			System.out.println(text);
			listTrainNames.add(text);
			
		}
		
		
		int listSize = listTrainNames.size();
		System.out.println("No.of.Train names: "+listSize);
		
		
		Set<String> setTrainNames = new HashSet<String>(listTrainNames);
		
		
		int setSize = setTrainNames.size();
		System.out.println("without duplicate size : "+setSize);
		
		if(listSize == setSize) {
			System.out.println("no duplicates");
		}else {
			System.out.println("duplicates are available");
		}
		
		
		
	}

}
