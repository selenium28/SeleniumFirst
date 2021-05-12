package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeginningTest {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		//Setting chrome driver executable property
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//Creating WebDriver reference 
		WebDriver driver= new ChromeDriver();  //WebDriver driver = new WebDriver();  // we can't create object of interface.
		
		//Launching desired url using get method
		driver.get(url);
		System.out.println("Url has been opened " +url);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		System.out.println("Login sucessfully");
		
		// https://accounts.lambdatest.com/register
		// https://phptravels.org/register.php

	}

}
