package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Links_count 
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		int link_count = driver.findElements(By.tagName("a")).size();
		System.out.println("Total link count ==>"+link_count);
		//Links in Footer section
		//limiting webdriver scope to footer section
		WebElement Footer_section=driver.findElement(By.id("gf-BIG"));
		int Footerlinkcount = Footer_section.findElements(By.tagName("a")).size();
		System.out.println("Total Footer link count==>"+Footerlinkcount);
		//limiting the section within footer
		//WebElement Columnsection_footer = Footer_section.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		WebElement Columnsection_footer = Footer_section.findElement(By.xpath("//ul[1]"));
		int Columnsectionfootercount = Columnsection_footer.findElements(By.tagName("a")).size();
		System.out.println("FooterColumn section count==>"+ Columnsectionfootercount);
		//To open all links in the footer section
		for(int i=1;i<Columnsectionfootercount;i++)
		{
			String Clickontablinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Columnsection_footer.findElements(By.tagName("a")).get(i).sendKeys(Clickontablinks);
			Thread.sleep(3000);
		}
		//String parentwin = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<>(windows);
		System.out.println("window count ==>"+windows.size());
		driver.switchTo().window(allwindows.get(0));
		System.out.println("parentwindow==>"+driver.getTitle());
		driver.switchTo().window(allwindows.get(1));
		System.out.println("window1==>"+driver.getTitle());
		driver.switchTo().window(allwindows.get(0));
		driver.switchTo().window(allwindows.get(2));
		System.out.println("window2==>"+driver.getTitle());
		driver.switchTo().window(allwindows.get(0));
		driver.switchTo().window(allwindows.get(3));
		System.out.println("window3==>"+driver.getTitle());
		driver.switchTo().window(allwindows.get(0));
		driver.switchTo().window(allwindows.get(4));
		System.out.println("window4==>"+driver.getTitle());
		driver.switchTo().window(allwindows.get(0));
		driver.quit();
	}

}
