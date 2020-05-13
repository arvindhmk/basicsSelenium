import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamicradiobuttonpractice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
//Implementing Assertions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String Textvalue = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("Value");
			System.out.println(Textvalue);
			
			if(Textvalue.equals("Wine"))
			{
				
			driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			Thread.sleep(1000);
			Assert.assertTrue(driver.findElements(By.xpath("//input[@name='group2']")).get(i).isEnabled());
		}
	}

}
}
