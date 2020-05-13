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

public class Sortingusingarraylist 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe" );
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension",false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.findElement(By.cssSelector("table[id='table1'] tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("table[id='table1'] tr th:nth-child(2)")).click();
		List<WebElement> firstName = driver.findElements(By.cssSelector("table[id='table1'] tbody tr td:nth-child(2)"));
		
		List<String> oList = new ArrayList<String>();
		for(int i=0;i<firstName.size();i++)
		{
			oList.add(firstName.get(i).getText());
		}
		System.out.println(oList);
		
		List<String> dList = new ArrayList<String>();
		
		for(int i=0;i<oList.size();i++)
		{
			dList.add(oList.get(i));
		}
		System.out.println(dList);
		Collections.sort(dList);
		Collections.reverse(dList);
		System.out.println("Sorted List==>"+dList);
		
		Assert.assertTrue(oList.equals(dList));
		
	}

}
