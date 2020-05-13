package Windowhnadle;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method4 
{

	public static void main(String[] args) throws InterruptedException 
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
		//driver.get("http://www.qaclickacademy.com/practice.php");
		driver.get("https://the-internet.herokuapp.com/status_codes");
		//WebElement headerdriver= driver.findElement(By.xpath("//header[@class='jumbotron text-center header_style']"));
		int headerlinkcount = driver.findElements(By.tagName("a")).size();
		System.out.println(headerlinkcount);
		for(int i=0;i<headerlinkcount;i++)
		{
			String Clickonlinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(Clickonlinks);
			Thread.sleep(3000);
		}
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
