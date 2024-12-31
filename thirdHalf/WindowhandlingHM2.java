package thirdHalf;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingHM2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/windows");

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String>  list = new ArrayList<String>(windowHandles);

		int size = list.size();
		System.out.println("List Size : " +size);

		driver.switchTo().window(list.get(0));

		driver.findElement(By.id("multi")).click();

		//		element.click();

		//		list.add("element");
		System.out.println("After added clicked 3rd windwow size  : " +list.size());

		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		
		System.out.println(list.size());

		System.out.println("All Window Title :");

		for (String string : windowHandles2) {

			String title1 = driver.switchTo().window(string).getTitle();
			System.out.println(title1);
		}

		System.out.println("-------------------");
		for (String allTitle : list) {
			String title = driver.switchTo().window(allTitle).getTitle();
			System.out.println(title);

		}

	}
}
