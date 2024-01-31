package qa.java.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
	
		
		System.out.println("Statement1");
		Thread.sleep(5000);
		System.out.println("Statement2");
		
		
		//Targeting input file from local driver
		FileInputStream fi=new FileInputStream("C:\\Users\\HP\\input.xlsx");
		
		

	}

}
