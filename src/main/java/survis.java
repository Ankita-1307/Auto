 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class survis {

	public static void main(String[] args) throws InterruptedException {
		
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");  
 	          
		          
		       WebDriver driver = new ChromeDriver();
		       
		      //implicit wait
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		       //URL launch
		       driver.get("http://clientapp.narola.online/HDE/survis/");
		      
		       //getting id of email field and store in a username variable
		       WebElement username = driver.findElement(By.xpath("//*[@id=\"lg_email\"]"));
		       
		       //getting id of password field and store in password variable
		       WebElement password = driver.findElement(By.xpath("//*[@id=\"lg_password\"]"));
		       
		      // getting id of signin button using findElement By id
		       WebElement signin= driver.findElement(By.xpath("//*[@id=\"frm_login\"]/div/div[5]/button"));
		      
		       
		       // sending values to email field and password
		       username.sendKeys("sadmin@narola.email");
		       password.sendKeys("123456");
		       
		       // Click on login button
		       signin.click();
		      
		       WebElement admin = driver.findElement(By.name(""));
		      admin.click();
		       
		       // Logout
		      WebElement logout = driver.findElement(By.xpath("/html/body"));
		      
		      logout.click();
		      
		       //close browser
		       driver.close();
		    }
	}




