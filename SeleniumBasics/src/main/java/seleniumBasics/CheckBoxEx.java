package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		//WebElement radioButtonOption1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		//radioButtonOption1.click();
		
		WebElement radioButtonOption2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		radioButtonOption2.click();
		
		WebElement radioButtonOption3=driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
		radioButtonOption3.click();
		
		WebElement checkBoxOption1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		checkBoxOption1.click();
		
		WebElement checkBoxOption2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		checkBoxOption2.click();
		
		WebElement checkBoxOption3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		checkBoxOption3.click();
		
		//WebElement checkBoxOption1=driver.findElement(By.xpath("//input[starts-with(@id,'vfb-6-0')]"));
		//checkBoxOption1.click();
		
		//WebElement checkBoxOption1=driver.findElement(By.xpath("//input[contains(@id,'vfb-6-0')]"));
		//checkBoxOption1.click();

	}

}
