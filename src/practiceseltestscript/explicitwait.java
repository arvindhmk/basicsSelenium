package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait 
{
//elementToBeClickable()
//elementToBeSelected()	
//presenceOfElementLocated()
//textToBePresentInElement()
//alertIsPresent() and so on...
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/login");
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		
		driver.findElement(By.name("password")).sendKeys("demouser");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#profile']")));
		
		profile.click();
		
		driver.close();
	
	}

}
