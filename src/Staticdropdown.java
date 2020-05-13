import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown 
{

	public static void main (String args[])

	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String site ="https://www.ticketgoose.com/bookhotels/";
		driver.get(site);
		driver.findElement(By.xpath("//input[@placeholder='1 Room(s)|1 adult(s)']")).click();
		Select s = new Select(driver.findElement(By.id("rooms")));
		s.selectByValue("1");
		Select s1 = new Select(driver.findElement(By.id("adults")));
		s1.selectByValue("2");
		Select s2 = new Select(driver.findElement(By.id("child")));
		s2.selectByValue("3");
		driver.close();
		
	}
}
