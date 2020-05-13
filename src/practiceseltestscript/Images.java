package practiceseltestscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Images 
{
	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Image.html");
		
//		WebElement img1 = driver.findElement(By.xpath("//div[@id='contentblock']//div[1]//div[1]//div[1]//img[1]"));
//		img1.click();
//		
		WebElement brokenimg = driver.findElement(By.xpath("//div[2]//div[1]//div[1]//img[1]"));

		String value = brokenimg.getAttribute("naturalWidth");
		
		if(value.equals("0"))
		{
			System.out.println("It's a broken image");
		}
		else
		{
			System.out.println("Its valid image");
		}		
		
		WebElement img3 = driver.findElement(By.xpath("//div[@id='contentblock']//div[3]//div[1]//div[1]//img[1]"));
		
		Robot rob =  new Robot();
		
		rob.mouseMove(292, 565);
		
		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
	}

}
