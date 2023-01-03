


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTPoint {

	public static void main(String[] args)throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");

/*driver.manage().window().maximize();

System.out.println("Window Size"+driver.manage().window().getSize());

Dimension d = new Dimension(600, 400);

//Thread.sleep(2000);

driver.manage().window().setSize(d);

System.out.println("Re-Window Size"+driver.manage().window().getSize());*/

//Thread.sleep(3000);

WebElement a = driver.findElement(By.xpath("//*[@title='Search']"));
a.sendKeys("JavatPoint",Keys.ENTER);

driver.manage().window().maximize();

driver.findElement(By.xpath("//*[text()='Learn Java Programming']")).click();

/*driver.navigate().to("https://www.google.co.in");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().back();
driver.navigate().refresh();*/

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,700)");

Thread.sleep(2000);

WebElement visibleEle = driver.findElement(By.id("java-platforms"));
js.executeScript("arguments[0].scrollIntoView();", visibleEle);

Thread.sleep(2000);
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

WebElement elementName = driver.findElement(By.className("footer2"));
js.executeScript("arguments[0].scrollIntoView();", elementName);



String oldTab = driver.getWindowHandle();			

driver.switchTo().newWindow(WindowType.TAB);	

Thread.sleep(3000);			

driver.get("https://www.google.com/");		

driver.switchTo().window(oldTab);			

String title = driver.getTitle();
System.out.println(title);

String url = driver.getCurrentUrl();
System.out.println(url);

String page = driver.getPageSource();
System.out.println(page);



driver.close();
driver.quit();
	
	}

}
