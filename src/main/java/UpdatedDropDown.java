import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.manage().window().maximize();
		   driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		   //dropdown with select tag
		 WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 
		 Select dropdown = new Select(staticDropdown);
		 dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		 Thread.sleep(3000);
		   
		 dropdown.selectByVisibleText("USD");  
		 
		 Thread.sleep(3000);
		 
		 dropdown.selectByValue("INR"); 
		 
		 //Updated dropdown
		   
	   driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000);
		   
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
	/*	  int i=1;
		   while(i<4)
		   {
			  driver.findElement(By.id("hrefIncAdt")).click(); // 3 times
			 i++;
		  }   */
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 	   
	  //alternate method
		   for(int i=1;i<4;i++)
		   {
			   driver.findElement(By.id("hrefIncAdt")).click();
		   }
		   
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		   driver.findElement(By.id("btnclosepaxoption")).click(); 
		   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 
		 }     
	
			/* driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			 
			 driver.findElement(By.xpath("//*[text()=' Mumbai (BOM)']")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			 
			 driver.findElement(By.xpath("(//*[text()=' Surat (STV)'])[2]")).click();    */
			 
			 
	

}
