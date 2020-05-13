package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.hotkey.Keys;

public class calendars 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
WebElement calendar =driver.findElement(By.xpath("//input[@id='datepicker']"));
calendar.click();

//calendar.sendKeys("03/10/2020");


WebElement monthxpath = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

String month = monthxpath.getText();

if(!month.equalsIgnoreCase("March"))
{
	driver.findElement(By.xpath("//a[@title='Next']")).click();
}
	

WebElement date =driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[2]//td[3]/a"));

date.click();


	}

}
