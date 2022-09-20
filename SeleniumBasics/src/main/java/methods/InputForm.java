package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputForm {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		
		WebElement submitform=driver.findElement(By.xpath("//button[text()='Submit form']"));
		String actualmessage=submitform.getText();
		System.out.println(actualmessage);
		
		String expectedmessage="Submit form";
		
		if(expectedmessage.equals(actualmessage)) {
			
			System.out.println("text in the button is submit form");
		}
		else {
			
			System.out.println("not submit form");
		}
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("harsha");
		firstname.click();
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("m");
		lastname.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("harshachachi@gmail.com");
		username.click();
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("pathanamthitta");
		city.click();
		
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("kerala");
		state.click();
		
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("689693");
		zip.click();
		
		WebElement link=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		link.click();
		
		WebElement submitformbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitformbutton.click();
		
		/*WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("harsha");
		firstname.click();
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("m");
		lastname.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("harshachachi@gmail.com");
		username.click();
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("pathanamthitta");
		city.click();
		
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("kerala");
		state.click();
		
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("689693");
		zip.click();
		
		WebElement link=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		link.click();
		
		WebElement submitform=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitform.click();
		
		String expectedMessage="Form has been submitted successfully!";
		
		WebElement responseMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=responseMessage.getText();
		System.out.println(actualMessage);
		
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("Form has been submitted successfully!");
			
		}
		else {
			System.out.println("not submitted successfully");
		}*/
		
		
		
		

		
		

	}

}
