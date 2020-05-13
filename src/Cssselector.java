import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
	}

}
