import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Folowingsibling {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "http://www.qaclickacademy.com/interview.php";
		driver.get(str);
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		driver.close();
		
//		//driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("Test");
//		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCSR");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
//		driver.findElement(By.cssSelector("input.decorativeSubmit\r\n")).click();
//		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
//		driver.findElement(By.xpath("//div[@id='left-content-column']/div/div[2]/ul/li[2]")).click();
		

}
}