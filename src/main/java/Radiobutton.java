import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		   
		   driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		   
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  
		  
		 
			 
	}

}
