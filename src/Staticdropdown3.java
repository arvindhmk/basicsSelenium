import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticdropdown3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String site = "https://book.spicejet.com/";
		driver.get(site);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//initial values selected is printed
		int i=1;
		while(i<2)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//incrementing the values by multiple clicks with while loop
		i++;
		}
		int j=1;
		while(j<3)
		{
		driver.findElement(By.id("hrefIncChd")).click();//incrementing the values by multiple clicks with while loop
		j++;
		}
		int k=1;
		while(k<3)
		{
		driver.findElement(By.id("hrefIncInf")).click();//incrementing the values by multiple clicks with while loop
		k++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// printing the final value
	}
}