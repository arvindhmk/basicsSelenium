package Misc;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handletablegrids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22691/bt-vs-snp-25th-match-caribbean-premier-league-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rowcount);
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		for (int i = 0; i < count - 2; i++) {
			String text = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			System.out.println(text);
			int integerCount = Integer.parseInt(text);
			sum = sum + integerCount;
			System.out.println(sum);
		}
		String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		System.out.println(extra);
		int integerExtra = Integer.parseInt(extra);
		int totalScore = sum + integerExtra;
		System.out.println(totalScore);

		String actualTotal = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		System.out.println(actualTotal);
		int total = Integer.parseInt(actualTotal);
		if (total == totalScore) {
			System.out.println("Total Score matched");
		} else {
			System.out.println("Score not matched");
		}
		driver.close();
	}
}
