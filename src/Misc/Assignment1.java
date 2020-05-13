package Misc;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe" );
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		//selecting checkbox
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		String text = checkbox.getAttribute("value");
		//select value from dropdown
		Select dd = new Select(driver.findElement(By.id("dropdown-class-example")));
		dd.selectByValue(text);
		Thread.sleep(4000);
		//enter 2nd option in textbox
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(4000);
		//click alert button
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(4000);
		driver.switchTo().alert();
		String Alert_text = driver.switchTo().alert().getText();
		if (Alert_text.contains(text)) 
		{
			System.out.println(text+" is present in "+Alert_text);
		}
		else
		{
			System.out.println("Does not have text");
		}
		driver.switchTo().alert().accept();
		driver.close();		
	}

	

}
