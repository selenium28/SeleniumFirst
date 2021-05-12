package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupTest {

	public static void main(String[] args) {
         
		String url = "http://demo.guru99.com/test/delete_customer.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver23= new ChromeDriver();
		driver23.get(url);
		driver23.manage().window().maximize();                            		
     	
		//Implicit wait is a feature of Webdriver
		//Here Webdriver will wait for certain amount of time before it throws No Such Element Exception
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver23.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver23.findElement(By.name("cusid")).sendKeys("76543");			
		driver23.findElement(By.name("submit")).click();		
        		
        // Switching to Alert        
       // Alert alert = driver.switchTo().alert();	
        Alert alert = driver23.switchTo().alert();
        String msg = driver23.switchTo().alert().getText();
        System.out.println(msg);
       // alert.accept();
        alert.dismiss();
        
        		
        // Get the text on Alert
////        String alertMessage= driver.switchTo().alert().getText();		
//        		
//        // Printing alert message		
//        System.out.println(alertMessage);	
//        		
//        // Accepting alert		
//        alert.accept();		
//        
//        driver23.quit();
    }	


}
