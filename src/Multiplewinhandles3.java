import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiplewinhandles3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com')]")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.yahoo.com')]")).click();
		Set<String> allwindows =driver.getWindowHandles();
		List<String> wins = new ArrayList<>(allwindows);
		driver.switchTo().window(wins.get(1));
		System.out.println(driver.getTitle());
		WebElement searchbox = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		searchbox.sendKeys("Selenium Webdriver");
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ENTER);
		driver.switchTo().window(wins.get(2));
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.facebook.com')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("testing");
		Thread.sleep(3000);
		driver.switchTo().window(wins.get(3));
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.yahoo.com')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("uh-search-box")).sendKeys("cricket");
		driver.switchTo().window(wins.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
