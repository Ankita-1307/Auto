import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Potato");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> filteredlist = veggies.stream().filter(veggie -> veggie.getText().contains("Potato"))
				.collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredlist.size());

	}

}
