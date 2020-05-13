package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tooltip 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='age']"));
		String tooltiptext = textbox.getAttribute("title");
		
		System.out.println(tooltiptext);
		
	}

}
