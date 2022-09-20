package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement searchbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundcolor=searchbutton.getCssValue("color");
		System.out.println(backgroundcolor);
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement okbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String actualbackgroundcolor=okbutton.getCssValue("background-color");
		System.out.println(actualbackgroundcolor);
		String expectedcolor="rgba(251, 121, 43, 1)";
		String actualbackgroundcolor1=okbutton.getCssValue("font-size");
		System.out.println(actualbackgroundcolor1);

	}

}
