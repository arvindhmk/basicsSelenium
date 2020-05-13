package Windowhnadle;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewinhandles2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parentid = driver.getWindowHandle();
		System.out.println("Parent ID ="+parentid);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> win = driver.getWindowHandles();
		int count=win.size();
		System.out.println(count);
		for(String allwindows : win)
		{
			if(!parentid.equalsIgnoreCase(allwindows))
			{
				driver.switchTo().window(allwindows);
				driver.findElement(By.name("q")).sendKeys("selenium Webdriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}
