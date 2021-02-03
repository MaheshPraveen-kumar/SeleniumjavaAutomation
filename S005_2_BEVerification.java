package SeleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Browser Element Verification
// getLocation() getCssValue() getSize() getText();
public class S005_2_BEVerification {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.findElementById("home").click();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		Point location = driver.findElementById("position").getLocation();
		System.out.println("Location of x and y axes: ");
		System.out.println("Location of x axes: "+location.getX());
		System.out.println("Location of y axes: "+location.getY());
		String cssColor = driver.findElementById("color").getCssValue("background-color");
		System.out.println("color of the textbox: "+cssColor);
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("height and width of the TextBox: "+size);
		System.out.println("height of the TextBox: "+size.getHeight());
		System.out.println("Width of the TextBox: "+size.getWidth());
		
		  String tet = driver.findElementById("color").getText();
		  System.out.println(tet);
		 
	}

}
