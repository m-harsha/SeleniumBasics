package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		
		WebElement option1 =driver.findElement(By.xpath("(//option[@value='option1'])[1]"));
		option1.click();
		WebElement option2 =driver.findElement(By.xpath("(//option[@value='option2'])[1]"));
		option2.click();
		WebElement option3 =driver.findElement(By.xpath("(//option[@value='option3'])[1]"));
		option3.click();
		WebElement option4 =driver.findElement(By.xpath("(//option[@value='option4'])[1]"));
		option4.click();
		WebElement option5 =driver.findElement(By.xpath("(//option[@value='option5'])[1]"));
		option5.click();
		WebElement option6 =driver.findElement(By.xpath("(//option[@value='option6'])[1]"));
		option6.click();
		WebElement option7 =driver.findElement(By.xpath("(//option[@value='option7'])[1]"));
		option7.click();
		WebElement option8 =driver.findElement(By.xpath("(//option[@value='option8'])[1]"));
		option8.click();
		WebElement option9 =driver.findElement(By.xpath("(//option[@value='option9'])[1]"));
		option9.click();
		WebElement option10 =driver.findElement(By.xpath("(//option[@value='option0'])[1]"));
		option10.click();
	}

}
