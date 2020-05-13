import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathncss {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://facebook.com");
//	    driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("1234");	
//	    driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234");
//	    driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	    driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("123456");
	    driver.findElement(By.cssSelector("input#pass.inputtext\r\n")).sendKeys("password");
	    driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	    Thread.sleep(2000);
	    driver.close();
	}
}
