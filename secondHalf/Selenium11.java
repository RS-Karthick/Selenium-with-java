package secondHalf;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium11 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement we1 = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions builder = new Actions(driver);
		builder.contextClick(we1).perform();

		driver.findElement(By.xpath("//span[.='Edit']")).click();

		//		System.out.println("Alert name : " +driver.switchTo().alert().getText());

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Name : "+alert.getText());
		alert.accept();

		driver.quit();
	}
}
