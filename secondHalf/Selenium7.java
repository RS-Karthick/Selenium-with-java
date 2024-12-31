package secondHalf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");
		//https://letcode.in/alert

		//		Thread.sleep(3000);
		String tt = driver.findElement(By.xpath("//label[text()='Accept the Alert']")).getText();
		System.out.println("simple alert Title : "+tt);

		driver.findElement(By.id("accept")).click();

		//		driver.findElement(By.linkText("Simple Alert")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple Alert : " +text);
		//		Thread.sleep(5000);
		alert.accept();


		driver.findElement(By.id("confirm")).click();
		//		Alert alert2 = driver.switchTo().alert();
		//		String text2 = alert2.getText();
		//		System.out.println("Confirm Alert : "+text2);
		driver.switchTo().alert();
		String text3 = alert.getText();
		System.out.println("Confirm Alert : "+text);
		//		Thread.sleep(5000);
		//alert2.dismiss();
		alert.dismiss();

		driver.findElement(By.id("prompt")).click();
		String text4 = alert.getText();
		System.out.println("Prompt Alert : "+text4);
		alert.sendKeys("Karthick RS");
		alert.accept();
		String text5 = driver.findElement(By.id("myName")).getText();
		System.out.println(text5);


	}
}
