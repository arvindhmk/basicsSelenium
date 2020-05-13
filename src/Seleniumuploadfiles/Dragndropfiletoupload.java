package Seleniumuploadfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndropfiletoupload 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Robot robo = new Robot();
		StringSelection Str = new StringSelection("C:\\Users\\user\\Desktop\\Java.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Str, null);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='drag-drop-upload']"));
		drop.click();
		robo.setAutoDelay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}

}
