package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//WebElement forgotLink=driver.findElement(By.tagName("select"));
		//forgotLink.click();
		
		//WebElement dropDown=driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
		//dropDown.click();
		
		WebElement csssearchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		csssearchfield.sendKeys("mobile");
		//csssearchfield.clear();
		String attributeValue=csssearchfield.getAttribute("id");
		System.out.println(attributeValue);
		String expectedtooltip="Search in";
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String actualtooltip=all.getAttribute("title");
		System.out.println(actualtooltip);
		
		
		
		
		
		
		
		
		
		
		//WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		
		//WebElement searchfield=driver.findElement(By.className("nav-input nav-progressive-attribute"));
		//searchfield.sendKeys("mobile");
		//searchfield.click();
		
		//WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		//searchbutton.click();
		
		//WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchfield.sendKeys("mobile");
		//searchfield.click();
		
		
		//WebElement searchbutton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']"));
		//searchbutton.click();
		
		//driver.findElement(By.xpath("//img[@class='s-image']")).click();
		//driver.quit();
		//driver.close();
		
		
		//WebElement sign=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		//sign.click();
		
		//WebElement hellosign=driver.findElement(By.xpath("//span[starts-with(text(),'Hello, sign in')]"));
		//System.out.println(hellosign.getText());
		//hellosign.click();
		
		//WebElement selectaddress=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]//following::span[starts-with(text(),'Hello,')]"));
		//System.out.println(selectaddress.getText());
		//selectaddress.click();
		
		
		//WebElement address=driver.findElement(By.xpath("//span[contains(text(),'Select your address')]"));
		//address.click();
				
		//WebElement todaysDeals=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		//todaysDeals.click();
		
		
		
		
		
				
		
		//driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		//WebElement sign=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		//sign.click();
		
		//WebElement closebutton=driver.findElement(By.className("_2KpZ6l _2doB4z"));
		//closebutton.click();
		
		

	}

}
