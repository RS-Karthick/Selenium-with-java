package secondHalf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium14 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/*
		 * driver.get("https://letcode.in/edit"); boolean enabled =
		 * driver.findElement(By.id("noEdit")).isEnabled();
		 * System.out.println("Is Enabled :" +enabled);
		 * 
		 * driver.get("https://letcode.in"); boolean displayed =
		 * driver.findElement(By.linkText("Log in")).isDisplayed();
		 * System.out.println("is Dislayed : "+displayed);
		 */

		driver.get("https://semantic-ui.com/elements/button.html");
		//		boolean enabled = driver.findElement(By.xpath("//button[contains(@class,'disabled')]")).isEnabled();
		//		System.out.println(enabled);
		WebElement element = driver.findElement(By.xpath("//button[contains(@class,'disabled')]"));
		String attribute = element.getAttribute("class");
		System.out.println(attribute.contains("disabled"));

		driver.get("https://letcode.in/radio");
//		boolean selected = driver.findElement(By.xpath("(//label[@class='radio'])[8]")).isSelected();
//		System.out.println("selected : " +selected);
		
		boolean selected = driver.findElement(By.id("notfoo")).isSelected();
		System.out.println("2 selected : "+selected);
	}
}
