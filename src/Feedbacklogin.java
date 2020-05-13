import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feedbacklogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://feedback.irctc.com/RailwayFeedbackReport/RailwayLogin");
//		driver.findElement(By.cssSelector("input#textfield3")).sendKeys("12345");
//		driver.findElement(By.cssSelector("input#textfield4")).sendKeys("password");
//		driver.findElement(By.cssSelector("input#button2")).click();
//		String s = driver.findElement(By.cssSelector("div#loginError")).getText();
//		System.out.println(s);
//		
		driver.findElement(By.xpath("//input[@id='textfield3']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='textfield4']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='button2']")).click();
		String s = driver.findElement(By.xpath("//div[@id='loginError']")).getText();
		System.out.println(s);
		
	}

}
