package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement logo=driver.findElement(By.xpath("(//a[@href='index.php'])[1]"));
		
		boolean statuslogo;
		
		statuslogo=logo.isDisplayed();
		
		System.out.println("logo is "+statuslogo);
		
		if(statuslogo=true) {
			System.out.println("logo present");
		}
		else {
			System.out.println("not present");
		}
		
		WebElement radioDemo=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radioDemo.click();
		
		WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		boolean statusmaleButton;
		
		statusmaleButton=maleButton.isEnabled();
		
		System.out.println("maleButton enabled "+statusmaleButton);
		
		if(statusmaleButton==true) {
			maleButton.click();
		}
		
		WebElement Button2=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		boolean statusButton2;
		
		statusButton2=Button2.isSelected();
		
		System.out.println("maleButton selected "+statusButton2);
		
		if(statusButton2==true) {
			System.out.println("male button is selected");
		}
		else {
			System.out.println("not selected");
		}
		
	}

	
}
