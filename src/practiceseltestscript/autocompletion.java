package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class autocompletion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		//Actions act = new Actions(driver);

		WebElement autotextbox = driver.findElement(By.xpath("//input[@id='tags']"));
		
		autotextbox.sendKeys("w");
		Thread.sleep(3000);
		autotextbox.sendKeys(Keys.DOWN);
		autotextbox.sendKeys(Keys.RETURN);

	}

}
