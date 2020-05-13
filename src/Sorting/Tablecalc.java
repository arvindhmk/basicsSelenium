package Sorting;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tablecalc 
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
		List<WebElement> due = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr/td[4]"));
		double sum=0;
		int count = due.size();
		System.out.println(count);
		for (int i=0;i<due.size();i++)
		{
			String value = due.get(i).getText();
			System.out.println(value);
			StringBuilder build = new StringBuilder(value);
			build.deleteCharAt(0);
			String exactvalue = build.toString();
			double amount = Double.parseDouble(exactvalue);
			sum=sum+amount;
		}
		System.out.println(sum);
		
	}

}
