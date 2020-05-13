package practiceseltestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getvsnavigateto 
{

	//navigate().to() -- maintains the history
	//
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("http://www.google.co.in");//get will wait until all the webelement appears in the HTML DOM
//		driver.navigate().to("http://www.google.co.in");
//		driver.findElement(By.name("q")).sendKeys("ducks"+Keys.ENTER);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.close();		
	}

}
