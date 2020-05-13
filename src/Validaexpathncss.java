import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validaexpathncss 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\Compressed\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("DemoCSR");
		driver.findElement(By.cssSelector("input#password.inputLogin\r\n")).sendKeys("crmsf");		
		driver.findElement(By.cssSelector("input.decorativeSubmit\r\n")).click();
		String text = driver.findElement(By.cssSelector("div#errorDiv.serviceError")).getText();
		System.out.println(text);
		//driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
	}

}
