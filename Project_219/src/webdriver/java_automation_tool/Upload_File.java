package qa.webdriver.java_automation_tool;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
		Thread.sleep(5000);
		
		WebElement UploadBtn=driver.findElement(By.xpath("//button[.='Upload Resume']"));
		UploadBtn.click();
		Thread.sleep(5000);
		
		
		//location of file
		String path="E:\\selenium dump\\Resume\\MyResume.docx";
		
		
		//Below lines of code copy selected string into clipboard memory..
		
		//Copy Paste Using AWT
		StringSelection spath=new StringSelection(path);
		//Get Clipboard access
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press CONTROL+V shortcut at keyboard
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release Control KEY
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//Don't forgot to release control
		
	}

}
