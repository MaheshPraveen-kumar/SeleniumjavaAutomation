package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S10_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		/* 
		
		  driver.findElementByXPath("//button[text()='Alert Box']").click();
		  // to swicth to alert 
		  Alert alert = driver.switchTo().alert();
		  //driver.switchTo().alert().accept();
		  System.out.println(alert.getText()); 
		  alert.accept();
		 
		  driver.findElementByXPath("//button[text()='Confirm Box']").click();
		  Alert alert2 = driver.switchTo().alert();
		  Thread.sleep(1000); alert2.sendKeys("Hi i'm Praveen");
		  //System.out.println(alert2.getText()); 
		  alert2.accept(); 
		  
		  driver.findElementByXPath("//button[text()='Prompt Box']").click();
		  Alert alert3 = driver.switchTo().alert();  
		  Thread.sleep(1000); 
		  alert3.sendKeys("Hi i'm Praveen");
		  //System.out.println(alert3.getText()); 
		  alert3.accept();*/
		
		  driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		  Alert alert4 = driver.switchTo().alert();  
		  Thread.sleep(1000); 
		  //alert4.sendKeys("Hi i'm Praveen");
		  //System.out.println(alert4.getText()); 
		  alert4.accept();
		  
		  driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
		  driver.findElementByXPath("//button[text()='OK']").click();
		
	}

}
