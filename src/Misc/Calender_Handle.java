package Misc;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_Handle 
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
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//select month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		//select date
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		System.out.println(count);
		//for the date 28
		for(int i=0;i<count;i++)
		{
			String days= driver.findElements(By.className("day")).get(i).getText();
			if(days.equalsIgnoreCase("28"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
