package Misc;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentontables 
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
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int total_row = table.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println(total_row);
		int total_column = table.findElements(By.xpath("//table[@id='product']//th")).size();
		System.out.println(total_column);
		String secondrow_Data = table.findElement(By.xpath("//table[@id='product']//tr[3]")).getText();
		System.out.println(secondrow_Data);
		driver.close();
	}

}
