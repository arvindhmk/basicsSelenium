package Windowhnadle;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascriptexe 
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
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		//driver.findElement(By.name("uid")).sendKeys("mngr34926");
		//driver.findElement(By.name("password")).sendKeys("amUpenu");
		WebElement button = driver.findElement(By.id("form_submit"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Get domain details
		String Domainname = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name==>"+Domainname);
		//get url
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("Url=>"+url);
		//get pagetitle
		String title = js.executeScript("return document.title;").toString();
		System.out.println("title=>"+title);
		//scroll
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		//Injecting Alert
		js.executeScript("arguments[0].click();", button);
		js.executeScript("alert('Welcome to Guru99');");
//		//Navigating to new page(launch new url)
//		js.executeScript("window.location='http://demo.guru99.com/'");
	}	
}
