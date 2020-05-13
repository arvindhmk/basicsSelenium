package Misc;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctcdate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).click();
		
		//Selecting the month and year
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-6 ng-star-inserted']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c14-6 ng-star-inserted']")).getText();
		System.out.println(month);
		System.out.println(year);	
		while(!(driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-6 ng-star-inserted']")).getText().contains("December") && driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c14-6 ng-star-inserted']")).getText().contains("2019")))
		{
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}
		//selecting date
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='ng-tns-c14-6 ng-star-inserted']/a"));
		int datecount = driver.findElements(By.xpath("//td[@class='ng-tns-c14-6 ng-star-inserted']/a")).size();
		System.out.println(datecount);
		for(int i=0;i<datecount;i++)
		{
			String Days = driver.findElements(By.xpath("//td[@class='ng-tns-c14-6 ng-star-inserted']/a")).get(i).getText();
			if(Days.equalsIgnoreCase("25"))
			{
				driver.findElements(By.xpath("//td[@class='ng-tns-c14-6 ng-star-inserted']/a")).get(i).click();
				break;
			}
		}
	}
}