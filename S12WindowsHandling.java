package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class S12WindowsHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		// to get the reference of current window use getWindowhandl() single
		
		String currentwindowhandle = driver.getWindowHandle();
		System.out.println(currentwindowhandle);
		System.out.println("*****************************************************");
		
		driver.findElementById("home").click();
		String title = driver.getTitle();
		System.out.println("the titel  "+title+" first windows");
		
		// to get the reference of all window open by selenium the getWindowHandles() plural 
		Set<String> windowHandles = driver.getWindowHandles();
		
		// to switch to second window then use list and copy set reference
		List<String> list = new ArrayList(windowHandles);
		
		// using index we can get the second windows
		String string = list.get(1);
		driver.switchTo().window(string);
		
		String title2 = driver.getTitle();
		System.out.println("the titel  "+title2+" first windows");
		System.out.println();
		
// to see windowhandles() is unique are not
		for (String string2 : windowHandles)
		{
			
			System.out.println(string2);
		}
		driver.close();
		String string1 = list.get(0);
		driver.switchTo().window(string1);
		
		
		
		
		  driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		  
		  
		  Set<String> setofsecondwind = driver.getWindowHandles();
		  int size = setofsecondwind.size();
		  System.out.println("by clicking second button "+size+" window is open ");
		    List<String> listofmultiwindown =new ArrayList<String>(setofsecondwind); 
		    String window1 = listofmultiwindown.get(0);
		  String window2 = listofmultiwindown.get(1);
		  String window3 = listofmultiwindown.get(2);
		  
		  driver.switchTo().window(window2); 
		  driver.manage().window().maximize();
		  String title3 = driver.getTitle();
		  System.out.println("title of second windows "+title3);
		  driver.close();
		  
		  driver.switchTo().window(window3); 
		  driver.manage().window().maximize();
		  String title4 = driver.getTitle();
		  System.out.println("title of second windows "+title4);
		  driver.close();
		  
		  driver.switchTo().window(window1);
		  System.out.println("the titel  "+driver.getTitle()+" current windows");
		
	}

}
