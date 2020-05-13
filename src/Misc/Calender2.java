package Misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender2 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		//Using javascript executor
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datepicker').value='09/10/2019'");
	
		
		//		String yeartoselect = "2020";
//		int yearforselect = Integer.parseInt(yeartoselect);
//
//		Calendar cal = Calendar.getInstance();
//		int currentyear = cal.YEAR;
//
//		if (!driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().contains("2020")) {
//			driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			Thread.sleep(2000);
//		}
//
//		while (!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains("December")) {
//			driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			Thread.sleep(2000);
//		}
//
//		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
//		int total_dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
//		System.out.println(total_dates);
//		for (int i = 0; i < total_dates; i++) {
//			String days = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
//			if (days.equalsIgnoreCase("3")) {
//				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
//			}
//		}

	}
}