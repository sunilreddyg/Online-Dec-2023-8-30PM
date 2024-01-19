package qa.webdriver.java_automation_tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Type_text_into_Notepad_File {

	public static void main(String[] args) throws AWTException, IOException, Exception 
	{
		
		//Open notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		//Type Hello charcters
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_D);
	
	}

}
