package SeleniumBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSnapDeal {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.findElementById("pushDenied").click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElementByXPath("(//span[contains(text(),'Men') and contains(text(),'Fashion')])[2]")).perform();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@id='category6Data']//span[text()='Shirts']")));
		
		driver.findElementByXPath("//div[@id='category6Data']//span[text()='Shirts']").click();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@data-filtername='avgRating']")));
		
		driver.findElementByXPath("//div[@data-filtername='avgRating']").click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//label[@for='avgRating-4.0']")));
		
		driver.findElementByXPath("//label[@for='avgRating-4.0']").click();
		
		Thread.sleep(500); 
		
		WebElement element = driver.findElementByXPath("//button[text()='Subscribe']");
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(500,0)");
		
		for(int i=0;i<20;i++)
		{
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(500);
			/*
			 * if(element.isDisplayed()) { break; }
			 */
		}
		
		//wait.until(ExpectedConditions.visibilityOf(element));
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		List<WebElement> lst_AllRatings = driver.findElementsByXPath("//div[@id='products']//p[@class='product-rating-count']");
		
		System.out.println("There are totally "+lst_AllRatings.size()+" shirts");
		
		//List<Integer> lst_Int_AllRatings = new ArrayList();
		
		int[] arr_AllRatings = new int[lst_AllRatings.size()];
		
		//int[] arr_AllRatings_lessthan90 = new int[lst_AllRatings.size()];
		
		for(int i=0;i<lst_AllRatings.size();i++)
		{
			int ratings = Integer.parseInt(lst_AllRatings.get(i).getText().replaceAll("[^0-9]", ""));
			
			arr_AllRatings[i] = ratings;
			System.out.println(arr_AllRatings[i]);
			
			/*
			 * if(ratings>=90) {
			 * //lst_Int_AllRatings.add(Integer.parseInt(each.getText().replaceAll("[^0-9]",
			 * ""))); arr_AllRatings_greaterthan90[i] = ratings;
			 * System.out.println(arr_AllRatings_greaterthan90[i]); } else {
			 * arr_AllRatings_lessthan90[i] = ratings;
			 * System.out.println(arr_AllRatings_lessthan90[i]); }
			 */
			
		}
		
		/*
		 * Arrays.sort(arr_AllRatings_greaterthan90);
		 * 
		 * Arrays.sort(arr_AllRatings_lessthan90);
		 */
		
		
		Arrays.sort(arr_AllRatings);
		
		System.out.println("Highest ratings "+arr_AllRatings[arr_AllRatings.length-1]);
		
		System.out.println("Lowest ratings "+arr_AllRatings[0]);
		
		String strPriceHighestRating_Xpath = "//div[@id='products']//p[@class='product-rating-count' and contains(text(),'"+arr_AllRatings[arr_AllRatings.length-1]+"')]/parent::div/preceding-sibling::div//span[starts-with(@id,'display-price')]";
		
		List<WebElement> lst_PriceHighestRating = driver.findElementsByXPath(strPriceHighestRating_Xpath);
		
		int[] arr_prices_HighestRating = new int[lst_PriceHighestRating.size()];
		
		for(int i=0;i<lst_PriceHighestRating.size();i++)
		{
			arr_prices_HighestRating[i] = Integer.parseInt(lst_PriceHighestRating.get(i).getText().replaceAll("[^0-9]", ""));
		}
		
		
		Arrays.sort(arr_prices_HighestRating);
		
		System.out.println(arr_prices_HighestRating[arr_prices_HighestRating.length-1]);

	}
	
	
	

}
