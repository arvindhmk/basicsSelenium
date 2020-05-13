package Seleniumuploadfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Uploadusingrobotclass 
{

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Robot robo = new Robot();
		
		robo.setAutoDelay(2000);
		
		StringSelection stringselect = new StringSelection("C:\\Users\\user\\Desktop\\Java.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		
		robo.setAutoDelay(2000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
