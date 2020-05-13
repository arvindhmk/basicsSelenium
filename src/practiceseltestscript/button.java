package practiceseltestscript;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class button 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		//find position of button
		
		WebElement buttonposition = driver.findElement(By.id("position"));
		Point location = buttonposition.getLocation();
		int X = location.getX();
		int Y = location.getY();
		
		System.out.println("location of button in X=="+X+"Y corodinates==" +Y);
		
		//find button color
		
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String color = buttoncolor.getCssValue("background-color");
		System.out.println("color=="+color);
		
		//finding size of button
		
		WebElement buttonsize = driver.findElement(By.id("size"));
		Dimension size= buttonsize.getSize();
		int height = size.getHeight();
		int weight = size.getWidth();
		
		System.out.println("Height=="+height+ "weight=="+weight);
		
		
		//Go to homepage
		WebElement clickbutton = driver.findElement(By.id("home"));
		clickbutton.click();
		
		
		
		
	}

}
