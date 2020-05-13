package Windowhnadle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.id("win1")).click();
		String parentid = driver.getWindowHandle();
		System.out.println("Parent ID ="+parentid);
		Set<String> win = driver.getWindowHandles();
		int count=win.size();
		System.out.println(count);
		for(String allwindows : win)
		{
			if(!parentid.equalsIgnoreCase(allwindows))
			{
				System.out.println("Parent window==>"+driver.getTitle());
				driver.switchTo().window(allwindows);
				driver.findElement(By.name("q")).sendKeys("selenium Webdriver");
				Thread.sleep(3000);
				System.out.println("Child Window-->"+driver.getTitle());
				//driver.close();
			}
		}
		driver.switchTo().window(parentid);
		System.out.println("Parent Window-->" + driver.getTitle());
		driver.close();
	}

}
