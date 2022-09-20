package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		WebElement singleCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		boolean statussingleCheckBox;
		boolean statuscheckBoxOne;
		boolean statuscheckBoxTwo;
		boolean statuscheckBoxThree;
		boolean statuscheckBoxFour;
		
		statussingleCheckBox=singleCheckBox.isSelected();
		statuscheckBoxOne=checkBoxOne.isSelected();
		statuscheckBoxTwo=checkBoxTwo.isSelected();
		statuscheckBoxThree=checkBoxThree.isSelected();
		statuscheckBoxFour=checkBoxFour.isSelected();
		
		System.out.println(statussingleCheckBox);
		System.out.println(statuscheckBoxOne);
		System.out.println(statuscheckBoxTwo);
		System.out.println(statuscheckBoxThree);
		System.out.println(statuscheckBoxFour);
		
		WebElement selectAll=driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAll.click();
		
		singleCheckBox.click();
		
		statussingleCheckBox=singleCheckBox.isSelected();
		statuscheckBoxOne=checkBoxOne.isSelected();
		statuscheckBoxTwo=checkBoxTwo.isSelected();
		statuscheckBoxThree=checkBoxThree.isSelected();
		statuscheckBoxFour=checkBoxFour.isSelected();
		
		System.out.println(statussingleCheckBox);
		System.out.println(statuscheckBoxOne);
		System.out.println(statuscheckBoxTwo);
		System.out.println(statuscheckBoxThree);
		System.out.println(statuscheckBoxFour);
		
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
	
		
WebElement select=driver.findElement(By.xpath("//input[@id='button-two']"));

boolean statusselect;

statusselect=select.isEnabled();

System.out.println(statusselect);

if(statusselect==true) {
	
	System.out.println("button is present");
}

else {
	System.out.println("not present");
}




	}

}
