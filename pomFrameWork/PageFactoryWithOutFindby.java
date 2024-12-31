package pomFrameWork;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryWithOutFindby {

	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;

	@Test
	void loginWithoutFindBy() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");

		PageFactory.initElements(driver, PageFactoryWithOutFindby.class);


		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		submitBTN.click();

	}
}
//	driver.findElement(By.cssSelector("input#email")).sendKeys("user@phptravels.com");
//
//	driver.findElement(By.cssSelector("#password")).sendKeys("demouser");
//
//	driver.findElement(By.cssSelector("#submitBTN")).click(