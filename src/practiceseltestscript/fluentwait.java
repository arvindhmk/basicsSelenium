package practiceseltestscript;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
driver.get("https://www.phptravels.net/login");
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		WebElement profile=wait.until(new Function<WebDriver,WebElement>()
				{
					public WebElement apply(WebDriver driver)
					{
						return driver.findElement(By.xpath("//a[@href='#profile']"));
					}
				});
				
				profile.click();
	}

}
