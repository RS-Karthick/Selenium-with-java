package secondHalf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		String url1 = driver.getCurrentUrl();
		System.out.println("1st Page URL : "+url1);

		driver.findElement(By.id("home")).click();
		String url2 = driver.getCurrentUrl();
		System.out.println("2nd Page URL : "+url2);

		driver.navigate().back();
		System.out.println("Return 1st page URL : " +driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println("Forward again 1st to 2nd page : "+driver.getCurrentUrl());

		driver.navigate().refresh();
		
		driver.navigate().to("https://letcode.in/signin");
		
	}
}
