import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Cheeckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Checkbox not selected //false
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Checkbox selected // true
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));

		boolean statusdisplay = checkbox.isDisplayed();
		System.out.println("Checkbox is Displayed >>" + statusdisplay);

		boolean statusenable = checkbox.isEnabled();
		System.out.println("Checkbox is enabled>>" + statusenable);

		boolean statuswithoutselected = checkbox.isSelected();
		System.out.println("Checkbox is selected>>" + statuswithoutselected);

		checkbox.click();

		boolean statusselected = checkbox.isSelected();
		System.out.println("Checkbox is selected>>" + statusselected);

	}

}
