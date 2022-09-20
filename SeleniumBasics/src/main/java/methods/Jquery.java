package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		
		WebElement download=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		
		String actualmessage=download.getText();
		
		System.out.println(actualmessage);
		
		String expectedmessage="JQuery UI Progress bar - Download Dialog";
		
		if(expectedmessage.equals(actualmessage)) {
			
			System.out.println("JQuery UI Progress bar - Download Dialog");
		}
		else {
			
			System.out.println("not download");
		}
		
		WebElement startdownload1=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		
		String actualmessage1=startdownload1.getText();
		
		System.out.println(actualmessage1);
		
		String expectedmessage1="Start Download";
		
		if(expectedmessage1.equals(actualmessage1)) {
			
			System.out.println("Start Download");
		}
		else {
			
			System.out.println("not startdownload");
		}
		

	}

}
