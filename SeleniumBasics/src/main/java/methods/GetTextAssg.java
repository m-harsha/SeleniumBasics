package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssg {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();
		
		WebElement enterMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessage.sendKeys("Hello World");
		enterMessage.click();
		
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText());
		yourMessage.click();
		

	}

}
