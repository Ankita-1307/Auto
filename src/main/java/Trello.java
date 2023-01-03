 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Trello {

	public static void main(String[] args) throws InterruptedException {
		
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");  
 	          
		          
		       WebDriver driver = new ChromeDriver();
		       
		      //implicit wait
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		       //URL launch
		       driver.get("https://trello.com/login");
		       driver.manage().window().maximize();
		      
		       //getting id of email field and store in a username variable
		       WebElement username = driver.findElement(By.id("user"));
		       
		       //getting id of password field and store in password variable
		       WebElement password = driver.findElement(By.id("password"));
		       
		      // getting id of login button using findElement By id
		       WebElement login= driver.findElement(By.id("login"));
		      
		       
		       // sending values to email field and password
		       username.sendKeys("aac@narola.email");
		       password.sendKeys("Trello@123");
		       
		       // Click on login button
		       login.click();
		   
		       
		       WebElement l = driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
		       WebElement p= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		       p.sendKeys("Trello@123");
		       l.click();
		       
		        
             //Click on create
               WebElement Create = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[2]"));
               Create.click();
		       
               //Click on Create board
              WebElement Createboard = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/nav/ul/li[1]/button"));
               Createboard.click();
               
               //Write Board Title
               WebElement BoardTitle = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/form/div[1]/label/input"));
               BoardTitle.click();
               
               //sending values
               BoardTitle.sendKeys("Seleniumdemo");
               Thread.sleep(5000);
               
              //Click on Create button
              WebElement Createbutton = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/form/button"));
              Createbutton.click();
               
              //Click on enter list title
             WebElement enterlisttitle = driver.findElement(By.name("name"));
              enterlisttitle.click();
               enterlisttitle.sendKeys("Eclipse");
        
              //Click on profileclick
               WebElement profileclick = driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/button[3]/div/span"));
               profileclick.click();
               
               //Click on logout
               WebElement logout = driver.findElement(By.xpath("/html/body/div[4]/div/section/div/nav/ul/li[8]/button"));
               logout.click();
               
               //Click on logout1
               WebElement logout1 = driver.findElement(By.xpath("//*[@id=\"logout-submit\"]/span"));
               logout1.click();
		   
		       //close browser
		      driver.close();
		       
		    }
	}



