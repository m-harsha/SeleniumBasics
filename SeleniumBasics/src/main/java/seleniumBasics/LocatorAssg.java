package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssg {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.google.com/?hl=en-US");
		 * 
		driver.manage().window().maximize();
		
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("mobile");
		searchfield.click();
		
		WebElement searchbutton=driver.findElement(By.name("btnK"));
		searchbutton.click();*/
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();
		
		WebElement searchfield=driver.findElement(By.id("single-input-field"));
		searchfield.sendKeys("Hello World");
		searchfield.click();
		
		WebElement searchbutton=driver.findElement(By.id("button-one"));
		searchbutton.click();

	}

}
