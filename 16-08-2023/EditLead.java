package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8072911618");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gk330257@gmail.com");
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("atlaa tech");
			driver.findElement(By.name("submitButton")).click();
			//Verify the text
			String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(text);

	}

}