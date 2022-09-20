package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelenium {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://phptravels.com/demo/");
        
        driver.manage().window().maximize();
		  
        WebElement button=driver.findElement(By.xpath("//button[@id='demo']"));
       
        boolean statusbutton1;
        statusbutton1=button.isEnabled();
        
        boolean statusbutton2;
        statusbutton2=button.isDisplayed();
        
        System.out.println("enabled "+statusbutton1);
        System.out.println("displayed "+statusbutton2);
       
        
        WebElement checkBox=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		boolean statuscheckBox;
		statuscheckBox=checkBox.isSelected();
		System.out.println("selected "+statuscheckBox);
		
		
	}

}
