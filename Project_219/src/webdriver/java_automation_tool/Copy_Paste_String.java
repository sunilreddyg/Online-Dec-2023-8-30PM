package qa.webdriver.java_automation_tool;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_Paste_String {

	public static void main(String[] args) throws Exception {
		

		//Open notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		String path="E:\\selenium dump\\Resume\\MyResume.docx";
		
		
		//Below lines of code copy selected string into clipboard memory..
		
		//Copy Paste Using AWT
		StringSelection spath=new StringSelection(path);
		//Get Clipboard access
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(spath, spath);
		
		
		//Press CONTROL+V shortcut at keyboard
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control KEY
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//Don't forgot to release control
		
		
		
		
	}

}
