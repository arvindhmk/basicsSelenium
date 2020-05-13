import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversingusingtextxpath 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "http://www.qaclickacademy.com/index.php";
		driver.get(str);
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Webdriver with Java Basics + Advanced + I')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Learn SQL in Practical + Database Testing from Scratch')]")).click();
		driver.close();
	}

}
