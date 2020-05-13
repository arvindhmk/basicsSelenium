import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Endtoend 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Website = "https://book.spicejet.com/";
		driver.get(Website);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='IXM'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i=1;
		while(i<2)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncChd")).click();
		Thread.sleep(2000);
		int j=1;
		while(j<3)
		{
		driver.findElement(By.id("hrefIncInf")).click();	
		j++;
		}
		Thread.sleep(2000);
		driver.findElement(By.id("hrefDecInf")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		Select s1 = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		s1.selectByValue("INR");
		driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit")).click();
		driver.close();
	}
}
