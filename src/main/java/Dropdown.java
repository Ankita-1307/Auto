import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main (String[]args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\cankita\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://form.jotformpro.com/42382403598964?");
	 	
	     WebElement month = driver.findElement(By.id("input_7_month"));
	     Select month_dropDown = new Select(month);
	     month_dropDown.selectByIndex(1);
	     System.out.println(month_dropDown.getFirstSelectedOption().getText());

	     WebElement day = driver.findElement(By.id("input_7_day"));
	     Select day_dropDown = new Select(day);
	     day_dropDown.selectByValue("7");

	     WebElement year = driver.findElement(By.id("input_7_year"));
	     Select year_dropDown = new Select(year);
	     year_dropDown.selectByVisibleText("1996");
  
	     
         WebElement month_dropdown1 = driver.findElement(By.id("input_7_month"));
         Select month1 = new Select(month_dropdown1);
 
         List<WebElement> dropdown = month1.getOptions();

         for(int i=0;i<dropdown.size();i++){

       	  String drop_down_values = dropdown.get(i).getText();

       	  System.out.println("dropdown values are " + drop_down_values);        	 

}
}
}