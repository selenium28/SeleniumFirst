package core;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchFunction {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		System.out.println("Url has been opened " +url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NAme");
		
//		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_query_top']"));
//		searchBox.sendKeys("Printed");
//
//		WebElement searchClick = driver.findElement(By.xpath("//button[@name='submit_search']"));
//		searchClick.click();
//
//		Select priceTag1 = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
		//		priceTag1.selectByVisibleText("Price: Highest first");
		//		priceTag1.selectByIndex(1);
//		priceTag1.selectByValue("price:asc");
//
//		WebElement lMail=driver.findElement(By.xpath("//*[@title='Mail']"));
//
//		Actions builder=new Actions(driver);
//		builder.moveToElement(lMail).build().perform();
//		
//		Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//
//		ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));

		//		Select drpCountry = new Select(driver.findElement(By.name("country")));
		//		drpCountry.selectByVisibleText("ANTARCTICA");

//		  //Instantiate Action Class        
//        Actions actions = new Actions(driver);
//        //Retrieve WebElement 'Music' to perform mouse hover 
//     WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
//     //Mouse hover menuOption 'Music'
//     actions.moveToElement(menuOption).perform();
//     System.out.println("Done Mouse hover on 'Music' from Menu");
//     
//     //Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
//     WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
//     //Mouse hover menuOption 'Rock'
//     actions.moveToElement(subMenuOption).perform();
//     System.out.println("Done Mouse hover on 'Rock' from Menu");
//     
//     //Now , finally, it displays the desired menu list from which required option needs to be selected
//     //Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
//     WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
//     selectMenuOption.click();
//     System.out.println("Selected 'Alternative' from Menu");
     




	}
	
	
}
