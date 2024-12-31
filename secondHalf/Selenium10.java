package secondHalf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium10 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		//		WebElement we1 = driver.findElement(By.xpath("//span[text()='Fashion']"));

		WebElement we2 = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]/img"));
		Actions builder = new Actions(driver);
		builder.moveToElement(we2).perform();

		WebElement we3 = driver.findElement(By.linkText("Men's Bottom Wear"));
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(we3).perform();

		//driver.findElement(By.linkText("Wallets")).click();
	}
}
