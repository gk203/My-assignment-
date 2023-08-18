package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacbookRegister {



	public static void main(String[] args) {
		
		   			ChromeDriver driver = new ChromeDriver();
		   			driver.manage().window().maximize();
		   			
		   			//facebook url/
		   			driver.get("https://en-gb.facebook.com/");
		   			
		   			//implicitywait
		   			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   		    //facebook create account
		   			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button'  ]")).click();
		   			driver.findElement(By.xpath("//input[@name = 'firstname'  ]")).sendKeys("Gokul");
		   			driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("R");
		   			driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("gokul@gmail.com");
		   			driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("gokul@gmail.com");
		   			driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("gokul@gmail.com");
		   			
		   			WebElement day= driver.findElement(By.id("day"));
					Select dayborn = new Select (day);
					dayborn.selectByIndex(7);
					
					WebElement month= driver.findElement(By.xpath("//select[@id=('month')]"));
					Select monthSelection= new Select(month);
					monthSelection.selectByIndex(11);
					
					
					WebElement year= driver.findElement(By.xpath("//select[@id=('year')]"));
					Select yearSelection = new Select(year);
					yearSelection.selectByIndex(26);
					
					driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();

					
					
             
	}

}
