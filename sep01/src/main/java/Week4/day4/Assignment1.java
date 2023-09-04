package Week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement mensFashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mensFashion).perform();
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("ShoesCount: " +shoesCount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		List<WebElement> shoesList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<String> o=new ArrayList<String>();
		for(int i=0;i<shoesList.size();i++) {
			String text = shoesList.get(i).getText();
			o.add(text);
		}
		Collections.sort(o);
		System.out.println(o);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();
		WebElement firstShoe = driver.findElement(By.xpath("(//section[@class='js-section clearfix dp-widget dp-fired']//div)[1]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(firstShoe).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[@class='js-section clearfix dp-widget dp-fired']//div)[1]")).click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();		
		Thread.sleep(2000);
		String offer = driver.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();		
		System.out.println("Price: Rs." +price+ "  Discount: "+offer);

	}

}
