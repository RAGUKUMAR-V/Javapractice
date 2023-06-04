package Seleniumpractice;


import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstclass {

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
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}	
	
	@AfterTest
	public void teardown() {

		driver.quit();
	}	



}
