import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxradiobutton {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
			driver.manage().window().maximize();
			System.out.println("Open site successfully");
			
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"articleBody\"]/table/tbody/tr/td/form/table/tbody/tr[4]/td[1]/input"));
		    boolean statusdisplay = checkbox.isDisplayed();
			System.out.println("Checkbox is Displayed >>" +statusdisplay); 
			
			boolean statusenable = checkbox.isEnabled();
			System.out.println("Checkbox is enabled>>"+statusenable);
			
			boolean statuswithoutselected = checkbox.isSelected();
			System.out.println("Checkbox is selected>>"+statuswithoutselected);
			
			checkbox.click();
			boolean statusselected = checkbox.isSelected();
			System.out.println("Checkbox is selected>>"+statusselected);
			
			Thread.sleep(2000);
			
			WebElement radiobutton = driver.findElement(By.id("seven"));
		    boolean statusisdisplay = radiobutton.isDisplayed();
			System.out.println("Radiobutton is Displayed >>" +statusdisplay); 
			
			boolean statusisenable = radiobutton.isEnabled();
			System.out.println("Radiobutton is enabled>>"+statusenable);
			
			boolean statuswithoutselect = radiobutton.isSelected();
			System.out.println("Radiobutton is selected>>"+statuswithoutselected);
			
			radiobutton.click();
			boolean statusselect = radiobutton.isSelected();
			System.out.println("Radiobutton is selected>>"+statusselected);
			

	         


}
}
