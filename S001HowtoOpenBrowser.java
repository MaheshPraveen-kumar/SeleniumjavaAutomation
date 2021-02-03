package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S001HowtoOpenBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.close();
		
 
	}

}
