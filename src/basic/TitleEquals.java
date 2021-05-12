package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TitleEquals {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		String expTitle = "OrangeHRM";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		System.out.println("Url has been opened " +url);
		driver.manage().window().maximize();
		
		//Get title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the Page: " +pageTitle);
		
		//Pass the test case if title matches with expected title else case is failed
		if(pageTitle.equals(expTitle)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		driver.findElement(By.id("welcome")).click();

//		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		System.out.println("Click logout button");
		
//		driver.quit();

	}

}
