package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributtes {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		String expectedtooltip="Mail";
		
		WebElement mailfield=driver.findElement(By.xpath("//a[@class='mail']"));
		String actualtooltip=mailfield.getAttribute("title");
		System.out.println("value of title attribute "+actualtooltip);
		
        String expectedtooltip1="Google+";
		
		WebElement googlefield=driver.findElement(By.xpath("//a[@class='google']"));
		String actualtooltip1=googlefield.getAttribute("title");
		System.out.println("value of title attribute "+actualtooltip1);
		
        String expectedtooltip2="YouTube";
		
		WebElement youtubefield=driver.findElement(By.xpath("//a[@class='you-tube']"));
		String actualtooltip2=youtubefield.getAttribute("title");
		System.out.println("value of title attribute "+actualtooltip2);
		
		
		
		

	}

}
