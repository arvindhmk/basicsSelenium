package Misc;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Verifyborkenlinks 
{
	@Test
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
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/status_codes");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int Links_count = links.size();
		
		for(int i=0;i<Links_count;i++)
		{
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyActiveLinks(url);			
		}
		driver.close();
	}
	
	public static void verifyActiveLinks(String linkUrl)
	{
		try
		{
			URL url= new URL(linkUrl);
			HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
			httpUrlConnect.setConnectTimeout(3000);
			httpUrlConnect.connect();
		if(httpUrlConnect.getResponseCode()==200)
			{
				System.out.println(linkUrl+"==>"+httpUrlConnect.getResponseMessage());
			}
			if(httpUrlConnect.getResponseCode()==httpUrlConnect.HTTP_NOT_FOUND)
			{
				System.out.println(linkUrl+"==>"+httpUrlConnect.getResponseCode()+"==>"+httpUrlConnect.HTTP_NOT_FOUND);
			}		
		}
		catch (Exception e)
		{
			
		}
	
	}

}
