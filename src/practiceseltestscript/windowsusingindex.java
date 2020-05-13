package practiceseltestscript;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsusingindex 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/home.html");
		
		
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		
		WebElement button = driver.findElement(By.linkText("Button"));		
		
		WebElement link = driver.findElement(By.linkText("HyperLink"));
		
		WebElement image = driver.findElement(By.linkText("Image"));
		
		String openinnewtab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		String parentwindow = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		edit.sendKeys(openinnewtab);
		
		button.sendKeys(openinnewtab);
		
		link.sendKeys(openinnewtab);
		
		image.sendKeys(openinnewtab);
		
		Thread.sleep(4000);
		
		Set<String> Allwindows = driver.getWindowHandles();
		
		ArrayList<String> Winindex = new ArrayList<String>(Allwindows);
 		
		int count = driver.getWindowHandles().size();
		
		System.out.println(count);
		
		driver.switchTo().window(Winindex.get(4));		
		
	}

}
