package Misc;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshotmethod2 
{
	static WebDriver driver;
	
	public static void Capturescreenshot(String screenshotname) throws IOException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-hh_mm_ss");
		Date dt = new Date();
		String screenshotdisplayname = screenshotname +" "+ sdf.format(dt);
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		File src = ef.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("E://screenshot1/"+screenshotdisplayname+".jpg"));
	}
		
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.findElement(By.id("alertBox")).click();
		Capturescreenshot("scrnshot");
		Thread.sleep(2000);
	}
}
