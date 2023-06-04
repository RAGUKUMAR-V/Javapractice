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

public class tpointpractice {

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
		driver.get("https://www.geeksforgeeks.org/java/?ref=shm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Python")).click();
		String title=driver.getTitle();	
		System.out.println(title);
		Assert.assertEquals(title, "Python Tutorial | Learn Python Programming");
		
	}
	
	@AfterTest public void teardown() {
	 
	 driver.quit(); }
	 



}
