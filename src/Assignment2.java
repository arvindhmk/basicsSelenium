

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Site = "https://www.cleartrip.com/";
		driver.get(Site);
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Che");
		Thread.sleep(5000);
		//driver.findElement(By.id("FromTag")).sendKeys("h");
		//driver.findElement(By.id("FromTag")).sendKeys("e");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ToTag")).sendKeys("Mad");
		//driver.findElement(By.id("ToTag")).sendKeys("a");
		//driver.findElement(By.id("ToTag")).sendKeys("d");
		Thread.sleep(5000);
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
		Thread.sleep(1500);
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");
		Thread.sleep(1500);
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("1");
		Thread.sleep(1500);
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select clas = new Select(driver.findElement(By.id("Class")));
		clas.selectByValue("Business");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Jet Airways");;
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='Search flights']")).click();
		driver.close();
	
	}

}
