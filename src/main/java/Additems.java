import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Additems {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		addItems(driver, itemsNeeded);

		Additems a = new Additems();
		a.addItems(driver, itemsNeeded);

		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());

		
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 kg
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether the name extracted is present in array list or not
			List items = Arrays.asList(itemsNeeded);
			if (items.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
