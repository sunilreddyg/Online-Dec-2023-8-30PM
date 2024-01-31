package qa.java.Conditions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Nested_Condition {

	public static void main(String[] args) 
	{
		
		
		int age=19;
		boolean healthcard=true;
		
		//Condition
		if(age > 18)
		{
			//Nested Condition
			if(healthcard)
			{
				System.out.println("Card benfits");
			}
			else
				System.out.println("No Healthcard");
		}
		else
		{
			System.out.println("age is invalid");
		}

	}

}
