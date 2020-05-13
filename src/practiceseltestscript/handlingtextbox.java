package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingtextbox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("mk@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text' and @value='Append ']")).sendKeys("text1");

		String value = driver.findElement(By.xpath("(//label[@for='uname']/following::input)[1]")).getAttribute("value");
	
		System.out.println(value);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		boolean status = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		System.out.println(status);
	
	}

}
