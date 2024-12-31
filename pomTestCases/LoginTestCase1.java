package pomTestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pomFrameWork.LoginPageObject1;
import pomFrameWork.UpdateMyProfilePOM;

public class LoginTestCase1 {
	
	@Test
	public  void login() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.phptravels.net/login");

//		driver.findElement(By.cssSelector("input#email")).sendKeys("user@phptravels.com");
//
//		driver.findElement(By.cssSelector("#password")).sendKeys("demouser");
//
//		driver.findElement(By.cssSelector("#submitBTN")).click();
//
//		driver.findElement(By.partialLinkText("My Profile")).click();
//
//		WebElement element1 = driver.findElement(By.id("Phone"));
//		element1.clear();
//
//		element1.sendKeys("1234567890");
//
//		WebElement element2 = driver.findElement(By.cssSelector("#City"));
//
//		element2.clear();
//		element2.sendKeys("Chennai");
		
//		LoginPageObject1.userName(driver).sendKeys("user@phptravels.com");
//		LoginPageObject1.password(driver).sendKeys("demouser");
//		LoginPageObject1.loginButton(driver).click();
		
		PageFactory.initElements(driver, LoginPageObject1.class);
		LoginPageObject1.userName.sendKeys("user@phptravels.com");
		LoginPageObject1.password.sendKeys("demouser");
		LoginPageObject1.loginButton.click();
		
//		UpdateMyProfilePOM.myProfile(driver).click();
//		UpdateMyProfilePOM.updatePhonrNumber(driver).sendKeys("123456");
//		UpdateMyProfilePOM.updateCity(driver).clear();
//		UpdateMyProfilePOM.updateCity(driver).sendKeys("chennai");
		
		PageFactory.initElements(driver, UpdateMyProfilePOM.class);
		UpdateMyProfilePOM.myProfile.click();
		UpdateMyProfilePOM.updatePhonrNumber.clear();
		UpdateMyProfilePOM.updatePhonrNumber.sendKeys("81488456");
		UpdateMyProfilePOM.updateCity.clear();
		UpdateMyProfilePOM.updateCity.sendKeys("Trichy");
		

	}
}
