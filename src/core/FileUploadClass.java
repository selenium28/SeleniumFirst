package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();   
		
		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
		fileUpload.sendKeys("C:\\Users\\devid\\OneDrive\\Documents\\FileUpload.txt");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		driver.quit();

	}

}
