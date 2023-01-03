import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

}
