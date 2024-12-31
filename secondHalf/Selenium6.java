package secondHalf;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selenium6 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");

		File fsrc = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Snaps/IMG.PNG");
		FileHandler.copy(fsrc, dst);

		WebElement we1 = driver.findElement(By.id("property"));
		File ss1 = we1.getScreenshotAs(OutputType.FILE);
		File dst1 = new File("./Snaps/Img2.Png");
		FileHandler.copy(ss1, dst1);

		WebElement we2 = driver.findElement(By.className("card-content"));
		File ss2 = we2.getScreenshotAs(OutputType.FILE);
		File dst2 = new File("./Snaps/Img3.png");
		FileHandler.copy(ss2, dst2);

		WebElement we3 = driver.findElement(By.className("content"));
		File ss3 = we3.getScreenshotAs(OutputType.FILE);
		File dst3 = new File("./Snaps/Img4.png");
		FileHandler.copy(ss3, dst3);

		driver.quit();

	}
}
