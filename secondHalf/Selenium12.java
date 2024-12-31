package secondHalf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium12 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://letcode.in/dropdowns");
		WebElement we1 = driver.findElement(By.id("fruits"));
		Select fruits = new Select(we1);
		fruits.selectByIndex(1);
		WebElement firstSelectedOption = fruits.getFirstSelectedOption();
		System.out.println(" Selected Item is : " +firstSelectedOption.getText());
		
		System.out.println("The Fruits option List :");
		List<WebElement> optionsList = fruits.getOptions();
		//allFruits.forEach(i -> System.out.println(i.getText()));

//		optionsList.forEach(i -> System.out.println(i.getText()));
		optionsList.forEach(list1 -> System.out.println(list1.getText()));
		
		
		System.out.println("This Fruits DD is Multiple select option : "+fruits.isMultiple());
		
		WebElement we2 = driver.findElement(By.id("superheros"));
		Select superHeroDD = new Select(we2);
		boolean multiple = superHeroDD.isMultiple();
		System.out.println("is Multiple : "+multiple);
//		superHeroDD.selectByIndex(0);
//		superHeroDD.selectByIndex(1);
		//Iron Man   Supergirl  Superman Wonder Woman
		superHeroDD.selectByVisibleText("Iron Man");
		superHeroDD.selectByVisibleText("Supergirl");
		superHeroDD.selectByVisibleText("Superman");
		superHeroDD.selectByVisibleText("Wonder Woman");
//		WebElement firstSelectedOption2 = superHeroDD.getFirstSelectedOption();
//		System.out.println(firstSelectedOption2.getText());
		List<WebElement> allSelectedOptions = superHeroDD.getAllSelectedOptions();
		System.out.println("you have slected these names :");
		allSelectedOptions.forEach(j -> System.out.println(j.getText()));
		
		List<WebElement> options = superHeroDD.getOptions();
		options.forEach(i -> System.out.println(i.getText()));
		
	}
}
