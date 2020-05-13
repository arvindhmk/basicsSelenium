import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentpart2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "http://qaclickacademy.com/practice.php";
		driver.get(site);
		//WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(count);
		driver.close();
	}

}
