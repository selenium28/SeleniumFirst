package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/upload/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();    
		
		//Locating choose file text box
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\devid\\OneDrive\\Documents\\FileUpload.txt");

        // Checking the Checkbox: I accept terms of service
        driver.findElement(By.id("terms")).click();

        // Click on submit file button
        driver.findElement(By.name("send")).click();
        
        //Closing the browser instance
        driver.quit();
        }

}
