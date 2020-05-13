package Misc;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Handlehiddenelements 
{

	public static void main(String[] args) 
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
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

	int x=driver.findElement(By.id("male")).getLocation().getX();
	int y=driver.findElement(By.id("male")).getLocation().getY();
	System.out.println("X =>"+x+"Y =>"+y);
	List<WebElement> id = driver.findElements(By.id("male"));
	int count = id.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		int location =id.get(i).getLocation().getX();
		if(location!=0)
		{
			id.get(i).click();
		}
	}
	driver.close();
	}

}
