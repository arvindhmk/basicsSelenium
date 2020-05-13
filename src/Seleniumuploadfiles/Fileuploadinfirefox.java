package Seleniumuploadfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Fileuploadinfirefox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		FirefoxOptions	op = new FirefoxOptions();
		op.setAcceptInsecureCerts(true);
		System.out.println(op.getBrowserName());
		System.out.println(op.getVersion());
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\user\\Desktop\\Java.docx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		Thread.sleep(13000);
		
	}

}
