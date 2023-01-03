import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevent {
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	driver.get("https://www.guru99.com/functional-testing.html");
	
	 WebElement mousehover = driver.findElement(By.id("how_to_do_functional_testing"));
	 Actions actmousehover = new Actions(driver);
	actmousehover.moveToElement(mousehover).build().perform();
	 
	 WebElement ClickandHold = driver.findElement(By.xpath("//*[@id=\"post-45\"]/div/div/h2[2]"));
 Actions actClickandHold = new Actions(driver);
	 actClickandHold.contextClick(ClickandHold).build().perform();
	
	actClickandHold.doubleClick().build().perform();
	  
      WebElement From = driver.findElement(By.xpath("//*[@id=\"post-45\"]/div/div/div[2]/h2"));
     
      WebElement To = driver.findElement(By.xpath("//*[@id=\"functional_testing_tools\"]"));
     Actions draganddrop = new Actions(driver);
     draganddrop.dragAndDrop(From,To).build().perform();
      
     driver.close();
     


}
}