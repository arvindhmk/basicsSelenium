package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scrollusingeventfiringwebdriver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		Thread.sleep(2000);
		ef.executeScript("document.querySelector('div.showcase:nth-child(3) div.content.mCustomScrollbar._mCS_3:nth-child(3) div.mCustomScrollBox.mCS-light-thick.mCSB_vertical.mCSB_outside div.mCSB_container p:nth-child(11) > textarea:nth-child(1)').scrollTop=300");
		
	}

}
