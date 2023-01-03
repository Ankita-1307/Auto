import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Gmaildemo {
public static void main(String[] args) {
		
		 
		
		  
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		    	          
		       WebDriver driver = new ChromeDriver();
		       //implicit wait
		       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		       
		       //URL launch
		       driver.get("https://accounts.google.com/signin");
		       driver.manage().window().maximize();
		       //identify email
		       WebElement l = driver
		       .findElement(By.xpath("//*[@id=\"identifierId\"]"));
		       l.sendKeys("ankitacnarola@gmail.com");
		       WebElement b = driver
		       .findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		       b.click();
		       
		       //identify password
		       WebElement p = driver
		      .findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		       p.sendKeys("anarola@03");
		    
		       
		      
		      WebElement n = driver
		    .findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		       n.click();
		       
		     
		     
		     //close browser
		       driver.close();
		    }
		    }
