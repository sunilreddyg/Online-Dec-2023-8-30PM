package qa.webdriver.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_And_Remove_Attributes {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--incagnito"));
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);

				
		WebElement Email=driver.findElement(By.id("email"));
		
		//Remove attribute
		js.executeScript("arguments[0].removeAttribute('placeholder')", Email);

		//Add attribute
		js.executeScript("arguments[0].setAttribute('placeholder','Welcome Sunil')", Email);
		
		
		//Target Object
		WebElement ForgotPWD=driver.findElement(By.linkText("Forgotten password?"));
		//Set target propery at runtime to opne page at private window
		js.executeScript("arguments[0].setAttribute('target','_blank')", ForgotPWD);
		ForgotPWD.click();  //This links open in private window..
	}

}
