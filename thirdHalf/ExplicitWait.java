package thirdHalf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions builder =new Actions(driver);
		builder.moveToElement(element).perform();

		WebElement element2 = driver.findElement(By.partialLinkText("Laptop Accessories"));
		element2.click();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.titleContains("It"));
		String title = driver.getTitle();
		System.out.println(title);

		//Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com
		//Itaccessories Store Online - Buy Itaccessories Online at Best Price in India | Flipkart.com

		//		driver.get("https://letcode.in/waits");
		//		// Wait for alert
		//
		//		driver.findElement(By.id("accept")).click();
		//		Alert alert = driver.switchTo().alert();
		//		System.out.println(alert.getText());
		//		alert.accept();

		//		Wait for alert ***********
		//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		//		System.out.println(until.getText());
		//		until.accept();

		//invisibility *****
		//driver.get("https://letcode.in/signin");
		//driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Pass123$");
		//driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

		//		driver.get("https://letcode.in/signin");
		//		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		//		driver.findElement(By.name("password")).sendKeys("Pass123$");
		//		driver.findElement(By.xpath("//button[contains(.,'LOGIN')]")).click();
		//		//WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		//
		//		WebElement dbox = driver.findElement(By.xpath("//div[contains(@role,'alertdialog')]"));
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//		String text = dbox.getText();
		//		System.out.println("The box text is :"+text);
		//		wait.until(ExpectedConditions.invisibilityOf(dbox));
		//
		//		driver.findElement(By.linkText("Sign out")).click();
		//		System.out.println("Successfully sign out");
	}
}
