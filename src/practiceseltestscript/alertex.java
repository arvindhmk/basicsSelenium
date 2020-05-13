package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertex 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//click the alert
		
		WebElement alertbox =  driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alertbx = driver.switchTo().alert();
		alertbx.accept();
		
		//Confirmbox
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]"));
		confirmbox.click();
		Thread.sleep(3000);
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		
		
		//Promptbox
		WebElement promptbox = driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]"));
		promptbox.click();
		Thread.sleep(3000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("appended text");
		prompt.accept();
		//sweet alert
		
		WebElement sweetalrt = driver.findElement(By.xpath("//button[@id='btn']"));		
		sweetalrt.click();
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		
	}

}
