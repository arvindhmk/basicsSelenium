import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement cond = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		String ele = driver.findElement(By.xpath("//p[@id='demo']")).getAttribute("innerHTML");
		Boolean status = cond.isDisplayed();
		if(status.TRUE)
		{
			System.out.println("Element is displayed");
			System.out.println(ele);
		}
		else
		{
			System.out.println("Element not displayed");
			System.out.println(ele);
		}
			
		driver.close();
	}

}
