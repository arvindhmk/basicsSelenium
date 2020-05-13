package practiceseltestscript;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot 
{

	public static void main(String[] args) throws IOException, AWTException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		
//		//Takescreenshot
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		TakesScreenshot scrnshot = (TakesScreenshot) driver;
//		File sourcefile =scrnshot.getScreenshotAs(OutputType.FILE);
//		File destinationfile = new File("E://screenshot1/"+System.currentTimeMillis()+"screenshot2.png");
//		FileUtils.copyFile(sourcefile, destinationfile);
//		System.out.println(timestamp);
		String scrname="screenshot";
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy-hh-mm-ss");
		Date dt = new Date();
		String screenhsotdisplaname = scrname+" "+sdf.format(dt);
		
		Robot robot = new Robot();
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dimen);
		BufferedImage source = robot.createScreenCapture(rect);
		File destination = new File("E://screenshot1/"+screenhsotdisplaname+".png");
		ImageIO.write(source, "png", destination);
		
		
		
		
		
		
		
		
	}

}
