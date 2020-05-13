package Misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_testleaf 
{

	public static void main(String[] args) throws ParseException, InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe" );
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		driver.findElement(By.id("datepicker")).click();
		String expectedDate = "10/03/2020";//mm/dd/yyyy
		
			
		
		//Retrieve month and date
		String[] dateVal = expectedDate.split("/");
		int monthToSelect = Integer.parseInt(dateVal[1]);
		System.out.println(monthToSelect);

		//Retrieve the year
		int yearToselect = Integer.parseInt(dateVal[2]);
		System.out.println(yearToselect);
				
				
		//Find month of calendar
		String selectedmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(selectedmonth);
		
		//Set the format of calendar to month text
		Calendar cal = Calendar.getInstance();
		
		//Convert month name to month number
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM");
		System.out.println(outputFormat.format(cal.getTime()));
		
		int presentMonth = Integer.parseInt(outputFormat.format(cal.getTime()));
		System.out.println(presentMonth);		
		
		if(monthToSelect>presentMonth)
		{
			for(int i=0;i<monthToSelect - presentMonth;i++)
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
			}
		}
		else if(monthToSelect<presentMonth)
		{
			for(int i=0;i<presentMonth - monthToSelect;i++)
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
				Thread.sleep(3000);
			}
		}
		
		//now select the date
		driver.findElement(By.linkText(dateVal[0])).click();
	}

}
