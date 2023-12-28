package launchbrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		
		//Browser launch code
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().setSize(new Dimension(1296, 688));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    
	    //User login syntax
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    


	}

}
