package Testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {

	public class yourLogoClass {
	WebDriver driver = new ChromeDriver();
	WebElement dynamicElement;
	public WebDriverWait wait = new WebDriverWait(driver, 10);

	@BeforeTest
public void beforeTesting(){
	}
	
	@Test
public void seleniumTesting(){
	driver.get("http://automationpractice.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("My Store"));
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("hanael@test1.com");
	driver.findElement(By.id("SubmitCreate")).click();
	title = driver.getTitle();
	Assert.assertTrue(title.contains("Login - My Store"));
	WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Hanael");
	driver.findElement(By.id("customer_lastname")).sendKeys("Bonilla");
	WebElement element = driver.findElement(By.id("email"));
	String email = element.getAttribute("value");
	System.out.println("Su email es" + email);
	Assert.assertEquals("hanael@test1.com", email);
	driver.findElement(By.id("passwd")).sendKeys("Test123");
	Select dropdown = new Select(driver.findElement(By.id("days")));
	dropdown.selectByIndex(2);
	dropdown = new Select(driver.findElement(By.id("months")));
	dropdown.selectByIndex(5);
	dropdown = new Select(driver.findElement(By.id("years")));
	dropdown.selectByValue("2000");
	driver.findElement(By.id("newsletter")).click();
	driver.findElement(By.id("optin")).click();
	driver.findElement(By.id("company")).sendKeys("Test");
	driver.findElement(By.id("address1")).sendKeys("Street test");
	driver.findElement(By.id("address2")).sendKeys("Street test 2");
	driver.findElement(By.id("city")).sendKeys("San Jose");
	dropdown = new Select(driver.findElement(By.id("id_state")));
	dropdown.selectByVisibleText("Hawaii");
	driver.findElement(By.id("postcode")).sendKeys("23451");
	dropdown = new Select(driver.findElement(By.id("id_country")));
	dropdown.selectByVisibleText("United States");
	driver.findElement(By.id("other")).sendKeys("Lorem ipsum dolor sit amet,   elit. Mauris tincidunt rutrum tortor id condimentum.");
	driver.findElement(By.id("phone")).sendKeys("0123456789");
	driver.findElement(By.id("phone_mobile")).sendKeys("0123456789");
	driver.findElement(By.id("alias")).clear();
	driver.findElement(By.id("alias")).sendKeys("hanael0816@test.com");
	driver.findElement(By.id("submitAccount")).click();
	title = driver.getTitle();
	Assert.assertTrue(title.contains("My account - My Store"));
	driver.findElement(By.className("logout")).click();
	title = driver.getTitle();
	Assert.assertTrue(title.contains("Login - My Store"));
	driver.findElement(By.id("email")).sendKeys("hanael@test1.com");
	driver.findElement(By.id("passwd")).sendKeys("Test123");
	driver.findElement(By.id("SubmitLogin")).click();
	title = driver.getTitle();
	Assert.assertTrue(title.contains("My account - My Store"));
	
	}
	
	@AfterTest
public void afterTesting(){
		
	}
	
}
}