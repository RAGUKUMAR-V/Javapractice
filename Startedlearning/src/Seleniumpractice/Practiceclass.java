package Seleniumpractice;


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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceclass {

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
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13 pro");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement s:links) {
			
			System.out.println(s);
			if(s.equals("[ 2 Pack] Phone Case for Apple iPhone 13 Pro Case Anime 6.1\",Cool Japanese Manga Design Pattern Printed Cases, Cartoon Aesthetic Case for Women Boys Men Girls")) {
				
				s.click();
				}
		}
	}	
	
	/*
	 * @AfterTest public void teardown() {
	 * 
	 * driver.quit(); }
	 */	



}
