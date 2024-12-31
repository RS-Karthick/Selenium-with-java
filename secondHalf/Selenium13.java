package secondHalf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium13 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://letcode.in/edit");

		String text1 = driver.findElement(By.xpath("(//div[@class='card-content'])[2]")).getText();
		System.out.println("2nd Options GetText list :" +text1);

		String text2 = driver.findElement(By.xpath("//div[@class='card-content']")).getText();
		System.out.println("1st Options GetText list :" +text2);

		//getAttribute

		String attribute1 = driver.findElement(By.xpath("//div[@class='card-content']")).getAttribute("class");
		System.out.println(attribute1);

		String att1 = driver.findElement(By.id("join")).getAttribute("id");
		System.out.println("id : " +att1);

		String att2 = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println("value : " +att2);

		String att3 = driver.findElement(By.id("join")).getAttribute("placeholder");
		System.out.println("placeholder : " +att3);

		String att4 = driver.findElement(By.id("join")).getAttribute("class");
		System.out.println("class : " +att4);
	}
}
