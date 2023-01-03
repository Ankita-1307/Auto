import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("//*[text()=' Mumbai (BOM)']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 
	     driver.findElement(By.xpath("(//*[text()=' Surat (STV)'])[2]")).click();
	
		 
		 //Datepicker
	
     driver.findElement(By.xpath("//*[contains(@class,'ui-state-default ui-state-highlight')]")).click();

      driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		 
	  driver.findElement(By.xpath("(//*[text()='17'])[2]")).click();   
	}
}

	  
	  
	  
	  
	  
	  
	  
	  
		
		