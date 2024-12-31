package pomFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class UpdateMyProfilePOM {
	
	@FindBy(partialLinkText = "My Profile")
	public static WebElement myProfile;
	
	@FindBy(id = "Phone")
	public static WebElement updatePhonrNumber;
	
	@FindBy(css = "#City")
	public static WebElement updateCity;

//	public static WebElement myProfile(ChromeDriver driver) {
//		return driver.findElement(By.partialLinkText("My Profile"));
//	}
//	public static WebElement updatePhonrNumber(ChromeDriver driver) {
//		WebElement element1 = driver.findElement(By.id("Phone"));
//		element1.clear();
//		return element1;
//
//	}
//	public static WebElement updateCity(ChromeDriver driver) {
//		WebElement element2 = driver.findElement(By.cssSelector("#City"));
//		return element2;
//	
//
//	}
}
