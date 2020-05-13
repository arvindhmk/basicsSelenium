package practiceseltestscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement button = driver.findElement(By.id("imagesrc"));
		button.sendKeys("C:\\Users\\user\\Desktop\\testleaf.pdf");
		
		String path="C:\\Users\\user\\Desktop\\testleaf.pdf";
		
//		StringSelection selection = new StringSelection(path);
//		
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		
//		Robot rob = new Robot();
//		
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_V);
//		
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);		
//		
				
	}

}
