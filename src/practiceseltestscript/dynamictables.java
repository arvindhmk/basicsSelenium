package practiceseltestscript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamictables 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/table.html");

		//Count of number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int Numofcol = columns.size();
	
		System.out.println(Numofcol);
	
		//count number of rows
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
	 
		System.out.println(rowcount);
	 
	 //Get progress value
		
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[1]"));
		
		String FinalValue = getpercent.getText().replace("%","");
		
		System.out.println(FinalValue);
		
		//Check the vital task for the least completed progress
		
		List<WebElement> progress = driver.findElements(By.xpath("//tr//td[2]"));
		
		ArrayList<Integer> percentval = new ArrayList<Integer>();
		
		for (WebElement praogvalues : progress) 
		{

			String individualvalues = praogvalues.getText().replace("%","");
			
			percentval.add(Integer.parseInt(individualvalues));
			
		}
		
		System.out.println(percentval);
		
		System.out.println(Collections.min(percentval));
		
		int minval = Collections.min(percentval);
		
		String smallval = Integer.toString(minval)+"%";
		
		String xpath = "//td[normalize-space()="+"\"" +smallval+ "\""+"]"+"//following::td[1]";
		
		System.out.println(xpath);
		
		WebElement check = driver.findElement(By.xpath(xpath));
		check.click();
		
		
		
	 
	
	}

}
