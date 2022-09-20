package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ElementDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",        \\geckodriver.exe);
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver",          \\msedgedriver.exe );
		//WebDriver driver=new EdgeDriver();
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println("url=" +url);
		driver.get(url);
		
	}

}
