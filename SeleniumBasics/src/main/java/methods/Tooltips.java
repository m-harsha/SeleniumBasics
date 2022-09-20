package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltips {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		
String expectedtooltip="Like us On Facebook";
		
		WebElement facebook =driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String actualtooltip=facebook.getAttribute("title");
		
		System.out.println("value of title attribute "+actualtooltip);
		
		
		
		String expectedtooltip1="Follow All";
		WebElement followall =driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String actualtooltip1=followall.getAttribute("title");
		
		System.out.println("value of title attribute "+actualtooltip1);
		
	}

}
