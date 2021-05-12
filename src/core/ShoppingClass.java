package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingClass {

	public static void main(String[] args) throws InterruptedException {
		//String url = "http://automationpractice.com/index.php";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement searchFunction = driver.findElement(By.id("search_query_top"));
		Thread.sleep(5000);
		searchFunction.sendKeys("ugsdfgsjhfjfhj");
		Thread.sleep(5000);
		searchFunction.clear();
		Thread.sleep(5000);
		searchFunction.sendKeys("Printed ");
		
		
			
		



	}

}
