package org.unit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Sample {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
	}
	
	@AfterClass
	public static void afterclass() {
		
		driver.quit();
		
	}
	
	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);

	}
	@Test
	public void test() throws Exception {
		WebElement user = driver.findElement(By.id("username"));
user.sendKeys("Priyavimal");
Thread.sleep(5000);
	}
	
	public void test1() throws Exception {
		WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("priya16vimal");
Thread.sleep(2000);
	}
	
}
