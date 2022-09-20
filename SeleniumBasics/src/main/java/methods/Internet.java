package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Internet {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkboxone=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkboxtwo=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		boolean statuscheckboxone;
		boolean statuscheckboxtwo;
		
		
		statuscheckboxone=checkboxone.isSelected();
		statuscheckboxtwo=checkboxtwo.isSelected();
		
		System.out.println(statuscheckboxone);
		System.out.println(statuscheckboxtwo);
		
		if(statuscheckboxone==false) {
			checkboxone.click();
		}
		
		if(statuscheckboxtwo==false) {
			checkboxtwo.click();
		}
		
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		boolean statuscheckbox;
		boolean statuscheckbox2;
		statuscheckbox=checkbox.isDisplayed();
		statuscheckbox2=checkbox2.isDisplayed();
		
		System.out.println(statuscheckbox);
		System.out.println(statuscheckbox2);
		if(statuscheckbox==false) {
			checkbox.click();
		}
		
		if(statuscheckbox2==false) {
			checkbox2.click();
		}
		

	}

}
