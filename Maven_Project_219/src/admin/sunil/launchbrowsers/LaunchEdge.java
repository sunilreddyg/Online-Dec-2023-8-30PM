package launchbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LaunchEdge {

	public static void main(String[] args) 
	{
		
		
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
