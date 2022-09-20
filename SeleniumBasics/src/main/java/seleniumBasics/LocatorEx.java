package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//WebElement forgotLink=driver.findElement(By.linkText("Forgotten password?"));
		//forgotLink.click();
		
		//WebElement forgotLink=driver.findElement(By.tagName("a"));
		//forgotLink.click();
		
		//WebElement forgotLink=driver.findElement(By.partialLinkText("Forgotten passwor"));
		//forgotLink.click();
		
		//WebElement forgotLink=driver.findElement(By.tagName("input"));
		//forgotLink.sendKeys("hai");
		
		WebElement email=driver.findElement(By.cssSelector("#email"));
		email.sendKeys("hashachachi@gmail.com");
		
		WebElement password=driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi"));
		password.sendKeys("har17");
		
		WebElement login=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		login.click();
		
		/*driver.get(driver.getCurrentUrl());
		
		WebElement forgotten=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		forgotten.click();*/
		
		WebElement loginBu=driver.findElement(By.xpath("//input[@name='email']//following::button[@id='loginbutton']"));
		loginBu.click();
		
		
		

	}

}
