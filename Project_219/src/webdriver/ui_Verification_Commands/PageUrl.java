package ui_Verification_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageUrl {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "E:\\browserdrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		if(driver.getTitle().contains("OrangeHRM"))
		{
			WebElement ForgotPassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
			ForgotPassword.click();
			
			String Exp_title="OrangeHRM";
			String Exp_url="/requestPasswordResetCode";
			
			String ActTitle=driver.getTitle();
			String ActUrl=driver.getCurrentUrl();
			
			
			if(ActTitle.equals(Exp_title) && ActUrl.contains(Exp_url))
			{
				System.out.println("Testpass, Expected url&Title prensented");
			}
			else
			{
				System.out.println("Testfail, Expected url&Title not presented");
			}
			
			
		}
		else
		{
			System.out.println("Home Page title not verified");
		}
		
		

	}

}
