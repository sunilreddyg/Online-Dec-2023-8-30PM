package framework.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

class WebDriverTest 
{
	static WebDriver driver;
	static String url="http://facebook.com";

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(4000);
		driver.quit();
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		driver.get(url);
	}

	@AfterEach
	void tearDown(TestInfo info) throws Exception 
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("Screens\\"+info.getDisplayName()+".png"));
	}

	@Test
	void verifysignuplink() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("SIgn up link verified");
	}
	
	@Test
	public void verifymessengerlink()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger link verified");
	}
	
	@Test
	public void Verifyloginpagelink()
	{
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Login Page Verified");
	}

}
