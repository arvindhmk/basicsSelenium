import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildtraverse 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "http://leaftaps.com/opentaps/control/login";
		driver.get(str);
		//driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("Test");
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.cssSelector("input.decorativeSubmit\r\n")).click();
		driver.findElement(By.xpath("//div[@id='wrapper']/div/form/input")).click();
		driver.close();
	}

}
