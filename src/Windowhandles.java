import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		//WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set <String> id = driver.getWindowHandles();
		Iterator<String> it= id.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("switching to child window");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("switch to parent window");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
