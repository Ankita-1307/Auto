import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		   driver.findElement(By.id("autosuggest")).sendKeys("ind");
		   Thread.sleep(3000);
		   
		 List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 
		 for(WebElement option:options)
		 {
			 if (option.getText().equalsIgnoreCase("India"))
					 {
				 option.click();
				 break;
					 }
	}
		 
		
         
         
	}
}
