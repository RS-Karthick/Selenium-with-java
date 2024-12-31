package secondHalf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium8 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame");

		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Karthick");
		driver.findElement(By.name("lname")).sendKeys("Ravics");
		String tt = driver.findElement(By.xpath("//p[contains(@class,'title has')]")).getText();
		System.out.println(tt);
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("karthickravics@gmail.com");
		
	driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		driver.findElement(By.name("lname")).sendKeys("Dayana");
		
		

	}
}
