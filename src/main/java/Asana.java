 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asana {	
	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe"); 
    WebDriver driver = new ChromeDriver();
    
   //implicit wait
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //URL launch
    driver.get("https://app.asana.com/-/login");
    
    driver.manage().window().maximize();
   
    //getting id of email field and store in a username variable
    WebElement username = driver.findElement(By.xpath("//*[@id=\"Login-appRoot\"]/div/div[1]/div[2]/form/div[1]/div/div/input"));
    username.sendKeys("aac@narola.email");
    WebElement c=driver.findElement(By.xpath("//*[@id=\"Login-appRoot\"]/div/div[1]/div[2]/form/div[2]"));
    c.click();
    
    WebElement password = driver.findElement(By.xpath("//*[@id=\"Login-appRoot\"]/div/div[1]/form/div[1]/div/input"));
    password.sendKeys("Asana@789");
    WebElement l=driver.findElement(By.xpath("//*[@id=\"Login-appRoot\"]/div/div[1]/form/div[2]"));
    l.click();
  


    WebElement aa = driver.findElement(By.xpath("//*[@id=\"asana_main_page\"]/div[1]/div[1]/div[1]/div[3]/div[4]"));
   aa.click();
    
    // LogOut
  WebElement LogOut = driver.findElement(By.className("MenuItem-label"));
   LogOut.click();
	}

}
