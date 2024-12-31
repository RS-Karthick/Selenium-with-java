package secondHalf;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium15 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com");

		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("aaaaa", Keys.TAB, "aaaa", Keys.ENTER);
	}
}
