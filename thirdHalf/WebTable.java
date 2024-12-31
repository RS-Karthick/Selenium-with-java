package thirdHalf;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/table");

		// go to table 2
		WebElement table = driver.findElement(By.id("simpletable"));

		// go to table Header
		List<WebElement> headers = table.findElements(By.tagName("th"));
		System.out.println("Header Names :");
		for (WebElement headerList : headers) {
			//			String text = headerList.getText();
			System.out.print(headerList.getText()+" | ");
		}

		// display all rows & 0th column name list

		List<WebElement> tbody = table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));

		int size = tbody.size();
		System.out.println("\n"+ "size is : " +size);

		//		List<WebElement> body1 = table.findElements(By.cssSelector("tbody tr"));
		//		System.out.println("\n" +body1.size());

		System.out.println("ZeroThColumn Name list : ");
		for (WebElement body : tbody) {
			List<WebElement> tdColumns = body.findElements(By.tagName("td"));
			WebElement ZeroThColumn = tdColumns.get(0);
			System.out.println(ZeroThColumn.getText());
		}

		for (int i = 0; i <size; i++) {
			List<WebElement> rows = tbody.get(i).findElements(By.tagName("td"));

			WebElement lastname = rows.get(1);

			System.out.println(lastname.getText());

			// click 3rd column present checkbox

			String text = lastname.getText();
			if (text.equals("Chatterjee")) {
				rows.get(3).findElement(By.tagName("input")).click();
				break;

			}

		}
	}
}
