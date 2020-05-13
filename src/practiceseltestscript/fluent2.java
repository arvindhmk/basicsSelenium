package practiceseltestscript;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();;

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	WebElement options=wait.until(new Function<WebDriver,WebElement>(){

		@Override
		public WebElement apply(WebDriver driver) 
		{
			// TODO Auto-generated method stub
			WebElement text=driver.findElement(By.xpath("//p[@id='demo']"));
		if(text.getAttribute("innerHTML").equalsIgnoreCase("webdriver"))
		{
			System.out.println("Value is =="+text.getAttribute("innerHTML"));
			return text;
		}else
		{
			System.out.println("Value is =="+text.getAttribute("innerHTML"));
			return null;
		}	
		}			
		});
		
	}

}
