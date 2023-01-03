import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		// get products

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			
			if (name.contains("Cucumber")) {
				// Click on Add to cart
				driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
				break;

			}

			String veggies[] = { "Cucumber", "Mushroom", "Corn", "Brinjal " };

			// convert array into array list for easy search

			List items = Arrays.asList(veggies);

			// check whether the name you extracted is present in arraylist or not

			if (items.contains(veggies))
				;
			{
				// Click on Add to cart
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();

			}

		}
	}
}
