package secondHalf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");

		//https://letcode.in/edit  or https://letcode.in

		//enter your full name
		driver.findElement(By.id("fullName")).sendKeys("Karthick RS", Keys.TAB);

		//Append a text and press keyboard tab
	/*	driver.findElement(By.id("join")).sendKeys(" character");

		// what is inside the text box
		String att = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(att);

		//clear the text
		driver.findElement(By.id("clearMe")).clear();

		//confirm edit field is disabled
		boolean displayed = driver.findElement(By.id("noEdit")).isDisplayed();
		System.out.println("Is Displayed : " +displayed);

		//confirm text is readyonly
		String att2 = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println("Is Ready only : " +att2);
		Thread.sleep(8000);
		//quit browser
		driver.quit(); */
	}
}
