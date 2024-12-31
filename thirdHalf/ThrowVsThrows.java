package thirdHalf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowVsThrows {
	//	public void learnThrow() {
	//		try {
	//			Thread.sleep(5000);
	//		} catch (InterruptedException e) {
	//			throw new RuntimeException();
	//		}
	//	}
	public static void main(String[] args) {
		ThrowVsThrows th = new ThrowVsThrows();
		//th.learnThrow();
		th.sampleThrowVsThrows();
	}
	public void sampleThrowVsThrows() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		try {
			driver.findElement(By.name("email1")).sendKeys("koushik350@gmail.com");
		} catch (Exception e) {
			throw new RuntimeException();
		}
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}
}
