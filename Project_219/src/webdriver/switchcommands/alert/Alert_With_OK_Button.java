package qa.webdriver.switchcommands.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_Button {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://telanganaepass.cgg.gov.in/tsepassmis/");
	    driver.manage().window().maximize();
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	    Alert_prompt_link.click();
	    //Thread.sleep(5000);
	    
	    
	    //Switch to alert window and read text from alert
	    String alertmsg=driver.switchTo().alert().getText();
	    System.out.println(alertmsg);
	    
	    
	    Thread.sleep(4000);
	    //Close alert
	    driver.switchTo().alert().accept();
	    
	    
	   
	    

	}

}
