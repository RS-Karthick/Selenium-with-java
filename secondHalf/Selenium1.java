package secondHalf;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}
}