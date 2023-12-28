package launchbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) 
	{
		//Set the property only when selenium version lower than4.5
		System.setProperty("webdriver.edge.driver", "E:\\browserdrivers\\msedgedriver.exe");
		
		//Launching edge driver
		EdgeDriver edge=new EdgeDriver();
		
		//loading webpage to automation to browser window
		edge.get("http://facebook.com");
		
		//print title
		System.out.println(edge.getTitle());
		
		//CLose browser
		edge.quit();
	}

}
