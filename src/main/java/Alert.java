
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main (String[]args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
     
     WebDriver driver = new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Alerts.html");
     
  WebElement displayalertbox = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
 displayalertbox.click();
  
   Thread.sleep(2000);
   
 org.openqa.selenium.Alert alert = driver.switchTo().alert();
   
   driver.switchTo().alert().accept();
     
 WebElement alertokcancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
  alertokcancel.click();
   
   WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
   confirmbox.click();
    
//driver.switchTo().alert().accept();
   Thread.sleep(2000);
  driver.switchTo().alert().dismiss();
  
   WebElement alerttxt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
   alerttxt.click();
  
  WebElement promptbox  = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
  promptbox.click();
   
 org.openqa.selenium.Alert  promptAlert = driver.switchTo().alert();
 String promptAlertText = promptAlert.getText();
 Thread.sleep(2000);
   promptAlert.sendKeys("Ankita");
  System.out.println("Demo");
 Thread.sleep(2000);
  
driver.switchTo().alert().accept();
  driver.close();


}
}
	
