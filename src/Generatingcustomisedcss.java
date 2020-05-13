import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generatingcustomisedcss 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.cssSelector("input#username")).sendKeys("DemoCSR");
	    driver.findElement(By.cssSelector("input#password.inputLogin")).sendKeys("crmsfa");
	    driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
	    driver.findElement(By.xpath("//*[@id='label']/a")).click();
	    driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/createLeadForm')]")).click();
	    driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/logout')]")).click();
	    driver.close();
		
		
	}

}
