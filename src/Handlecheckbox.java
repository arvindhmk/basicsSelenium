import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handlecheckbox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='sing']")).isSelected());
		driver.findElement(By.xpath("//input[@id='sing']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='sing']")).isSelected());
		driver.close();
	}

}
