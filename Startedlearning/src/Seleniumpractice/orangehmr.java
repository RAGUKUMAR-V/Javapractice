package Seleniumpractice;


import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehmr {

	WebDriver driver;

	@BeforeTest	
	public void invoke() {	
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);		
	}

	@Test
	public void testscenario() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@fdprocessedid='jxmkmu' and @class='oxd-input oxd-input--active']")).click();
		//driver.findElement(By.xpath("//input[@fdprocessedid='jxmkmu' and @class='oxd-input oxd-input--active']")).sendKeys("Ragu");
		//driver.findElement(By.xpath("//div[@text='ESS']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Ragu");
		//input[@fdprocessedid='jxmkmu' and @class='oxd-input oxd-input--active']
	}
	
	/*
	 * @AfterTest public void teardown() {
	 * 
	 * driver.quit(); }
	 */
	 



}
