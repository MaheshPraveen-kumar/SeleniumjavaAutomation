package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S007findElementS {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		List<WebElement> input = driver.findElementsByTagName("input");
		System.out.println(input.size());
		for (WebElement eachinput : input) {
			String nameValue = eachinput.getAttribute("name");
			
			System.out.println(nameValue);
			
		}
		List<WebElement> inputLogin = driver.findElementsByClassName("inputLogin");
		System.out.println(inputLogin.size());
		for (WebElement eachinput : inputLogin) {
			String idValue = eachinput.getAttribute("id");
			System.out.println("getAttribute of : "+idValue);
						
		}
		
	}

}
