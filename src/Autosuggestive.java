import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestive 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
//Implementing Assertions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2500);
		dest.sendKeys("C");
		Thread.sleep(2500);
		dest.sendKeys("h");
		Thread.sleep(2500);
		dest.sendKeys("e");
		Thread.sleep(2500);
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
		String Textvalue= driver.findElement(By.id("toCity")).getAttribute("value");
		System.out.println(Textvalue);
		Assert.assertEquals(Textvalue,"Chennai");
		Thread.sleep(2500);
		driver.close();
	}
}

//		driver.manage().window().maximize();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
//
//		Thread.sleep(3000);
//
//		WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
//
//		source.sendKeys("Mum");
//
//		source.sendKeys(Keys.ARROW_DOWN);
//
//		source.sendKeys(Keys.ENTER);
//
//		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
//
//		destination.sendKeys("s");
//
//		Thread.sleep(2000);
//
//		destination.sendKeys("a");
//
//		Thread.sleep(2000);
//
//		destination.sendKeys("n");
//
//		Thread.sleep(3000);
//
//		int i=0;
//
//		while(i<3)
//
//		{
//
//		Thread.sleep(3000);
//
//		destination.sendKeys(Keys.DOWN);
//
//		i++;
//
//		}
//
//		destination.sendKeys(Keys.ENTER);
//
//		}
//
//		}
//
