import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicradiobutton 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			//Thread.sleep(1500);
		// if the value attribute does not exist
			
		String Valuetext =(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("Value"));
		System.out.println(Valuetext);
		if(Valuetext.equals("Milk"))
		{
			
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		}
	}
}
