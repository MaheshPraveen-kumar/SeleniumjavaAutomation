package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S12_1WIndowIRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[contains(text(),'OK')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'FLIGHTS')]").click();
		
		Set<String> irctcsetwindows = driver.getWindowHandles();
		List<String> listwindowsFly= new ArrayList<String>(irctcsetwindows);
		
		String firstwindow = listwindowsFly.get(0);
		String secondwindow = listwindowsFly.get(1);
		
		driver.switchTo().window(secondwindow);
		System.out.println("second windown title "+driver.getTitle());
		
		driver.switchTo().window(firstwindow);
		driver.close();
		
		
		
		
		
		
	}

}
