package Windowhnadle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Method3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		//String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		//driver.switchTo().window(parentwindow);
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; newMsgWin()']")));
		driver.findElement(By.xpath("//button[@id='win2']")).click();
		//driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//button[@id='win2']")).click();
		//driver.switchTo().window(parentwindow);
		Set<String> win = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(win);
		int count = win.size();
		System.out.println(count);
		driver.switchTo().window(windows.get(1));
		System.out.println("First window -->"+driver.getTitle());
		driver.switchTo().window(windows.get(2));
		System.out.println("Second window -->"+driver.getTitle());
		driver.switchTo().window(windows.get(3));
		System.out.println("Third window -->"+driver.getTitle());
		driver.switchTo().window(windows.get(0));
		System.out.println("Parent window -->"+driver.getTitle());
		driver.quit();
		
		
	}

}
