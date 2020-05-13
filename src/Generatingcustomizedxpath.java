import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generatingcustomizedxpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\user\\\\Downloads\\\\Compressed\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();;
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/myHomeMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/logout')]")).click();
		driver.close();
	}

}
