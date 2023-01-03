import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dequeuniversity.com/library/aria/date-picker");

		//Click on calendar icon
		driver.findElement(By.xpath("//*[@alt='Calendar View']")).click();

	while (!driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText().contains("Jan"))  //while loop will keep on executing until it becomes false //! Negation

		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}

		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		
		int count = driver.findElements(By.xpath("//*[@class='ui-state-default']")).size();
		
		for (int i = 0; i < count; i++)
		{
			String text = driver.findElements(By.xpath("//*[@class='ui-state-default']")).get(i).getText();
			if (text.equalsIgnoreCase("7"))
			{
				driver.findElements(By.xpath("//*[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
	}

}
