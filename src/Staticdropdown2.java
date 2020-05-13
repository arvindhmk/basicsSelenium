import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown2 
{
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String site = "http://www.qaclickacademy.com/contact.php";
		driver.get(site);
		driver.findElement(By.xpath("//input[@id='contact-input-name']")).sendKeys("TESTING");
		driver.findElement(By.xpath("//input[@id='contact-input-mobile']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id='contact-input-country']")).sendKeys("ENG");
		//driver.findElement(By.cssSelector("select[id='contact-input-subject']")).click();
		Select s = new Select(driver.findElement(By.id("contact-input-subject")));
		s.selectByVisibleText("Online Courses");
		driver.findElement(By.cssSelector("textarea#contact-input-message")).sendKeys("test");
		driver.findElement(By.xpath("//div[@class='text-center']//button[@class='btn btn-primary'][contains(text(),'Submit')]")).click();
		//String Alert = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/label[1]/span[1]")).getText();
		//String Alert = driver.findElement(By.xpath("//*[contains(text(),'Email is required.')]")).getAttribute("innerHTML");
		String Alert = driver.findElement(By.cssSelector("span.help-block")).getText();
		//String Alert = driver.findElement(By.xpath("//div[@id='contact-email-group']/label/span")).getText();
		System.out.println(Alert);
		
		
		
		
		
	
	}

}
