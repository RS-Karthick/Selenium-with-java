package thirdHalf;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleHM {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/windows");

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(windowHandles);

		WebDriver childwindow = driver.switchTo().window(list.get(1));
		System.out.println("window 1 : "+childwindow.getTitle());

		WebDriver window2 = driver.switchTo().window(list.get(0));
		System.out.println("window 0 : "+window2.getTitle());
		driver.close();
		//		window2.close();  get error

		//		childwindow.close();   get error



			WebDriver window3 = driver.switchTo().window(list.get(1));
			driver.close();
			

	}
}
