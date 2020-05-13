package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Sortingstingusingarraylist 
{

	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe" );
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension",false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> names = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		List<String> originalList = new ArrayList<String>();
		for(int i=0;i<names.size();i++)
		{
			
			originalList.add(names.get(i).getText());
		}
		System.out.println(originalList);
		
		List<String> copyList = new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
			copyList.add(originalList.get(i));
		}
		Collections.sort(copyList);
		
		Collections.reverse(copyList);
		System.out.println(copyList);
		Assert.assertTrue(originalList.equals(copyList));
	}
}
