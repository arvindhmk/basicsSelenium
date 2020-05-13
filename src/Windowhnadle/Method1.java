package Windowhnadle;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.findElement(By.id("cookie_action_close_header")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> allwindows = win.iterator();
		String parentid = allwindows.next();
		String childid = allwindows.next();
		System.out.println("Parent Window");
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println("Child Window");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("cookie_action_close_header")).click();
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parentid);
		System.out.println("Parent Window");
		System.out.println(driver.getTitle());
						
	}

}
