package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicConcepts {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		String getTitle = driver.getTitle();
		System.out.println("Title of this Application: " +getTitle);
		String geturl = driver.getCurrentUrl();
		System.out.println("Application URL: " +geturl);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
