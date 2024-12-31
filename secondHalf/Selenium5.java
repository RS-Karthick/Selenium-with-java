package secondHalf;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");

		// Get the X & Y co-ordinates

		WebElement we1 = driver.findElement(By.id("position"));
		Point point = we1.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("X value is : " +x + " Y value is : "+y);

		// Find the color of the button
		WebElement we2 = driver.findElement(By.id("color"));
		String cssValue = we2.getCssValue("background-color");
		System.out.println("Button color is : " +cssValue);

		// Find the height & width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println("Width : " +rect.getWidth());
		System.out.println("Height : "+rect.getHeight());

		// Confirm button is disabled
		boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println("IsEnabled : "+enabled);
		
		driver.quit();
	}
}
