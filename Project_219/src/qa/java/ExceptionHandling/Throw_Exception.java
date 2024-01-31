package qa.java.ExceptionHandling;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Throw_Exception {

	public static void main(String[] args) throws Exception 
	{
		
		
		if(true)
		{
			throw new Exception("Just Stop it");
		}
		
		System.out.println("Hello Everyone");

	}

}
