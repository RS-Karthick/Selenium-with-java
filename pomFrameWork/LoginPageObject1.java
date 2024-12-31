package pomFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject1 {
	
	@FindBy(css = "input#email")
	public static WebElement userName;
	
	@FindBy(css = "#password")
	public static WebElement password;
	
	@FindBy(how = How.CSS, using = "#submitBTN")
	public static WebElement loginButton;
	
	
	
//public static WebElement userName(ChromeDriver driver) {
//	return driver.findElement(By.cssSelector("input#email"));
//}
//public static WebElement password(ChromeDriver driver) {
//	return driver.findElement(By.cssSelector("#password"));
//}
//public static WebElement loginButton(ChromeDriver driver) {
//	return driver.findElement(By.cssSelector("#submitBTN"));
//}


}
