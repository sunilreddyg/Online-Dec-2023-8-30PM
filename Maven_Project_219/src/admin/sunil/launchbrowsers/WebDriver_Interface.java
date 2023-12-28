package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		//Launching Edge Browser and storing into WebDriver class refrence
		WebDriver driver=new EdgeDriver();
		//loading webpage to automation browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		

	
	}

}
