package qa.java.ExceptionHandling;

public class Runtime_Exceptions {

	public static void main(String[] args)
	{
		
		System.out.println("Program1 started");
		
		
		
		try {
			int a=99/0;    //Write error code here
		    System.out.println("Operation Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		
		
		

		try {
			int a=99/10;    //Write error code here
		    System.out.println("Operation Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
