package Misc;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshotmethod1 
{
	static WebDriver driver;
	
	public static void Capturescreen(String screenshotname) throws IOException
	{
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy-hh_mm_ss");
		Date dt = new Date();
		String screenshotnameformat = screenshotname+" "+fmt.format(dt);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E://screenshot/"+screenshotnameformat+".jpeg"));
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Capturescreen("screenshot");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
