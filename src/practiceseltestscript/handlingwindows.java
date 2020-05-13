package practiceseltestscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingwindows 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Window.html");

		String parentwindow = driver.getWindowHandle();
		
		WebElement homepage = driver.findElement(By.id("home"));
		
		homepage.click();
		
		Set<String> winhandles = driver.getWindowHandles();
		
		for (String win : winhandles) 
		{
			//if(!(parentwindow.equalsIgnoreCase(win)))
			//{
				driver.switchTo().window(win);
				
			//}	
		}
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='post-153']//li[1]//a[1]//img[1]")).click();
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
		WebElement multiplewindows = driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]"));
		multiplewindows.click();
		
		int openWincount = driver.getWindowHandles().size();
		
		System.out.println(openWincount);
		
		WebElement dontclose = driver.findElement(By.xpath("//button[contains(text(),'Do not close me')]"));
		
		dontclose.click();
		
		Set<String> openwin = driver.getWindowHandles();
		
		for (String Allwin : openwin) 
		{
		
			if(!Allwin.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(Allwin);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		
		WebElement windowwithwait = driver.findElement(By.xpath("//button[contains(text(),'Wait for 5 seconds')]"));
		
		windowwithwait.click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
				
		Set<String> Activewin = driver.getWindowHandles();
		
		for (String wins : Activewin) 
		{
			wait.until(ExpectedConditions.numberOfWindowsToBe(3));
			
			driver.switchTo().window(wins);
			
			System.out.println(driver.getTitle());
		}
	
		driver.quit();
	}

}
