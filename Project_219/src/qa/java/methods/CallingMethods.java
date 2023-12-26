package qa.java.methods;

public class CallingMethods 
{
	//Instant method
	public void methodA() 
	{
		//Calling static method inside instant method.
		//Static is a power user
		methodC();
		System.out.println("methodA executed");
	}
	
	//instant method
	public void methodB()
	{
		System.out.println("methodB executed");
	}
	
	public static void methodC()
	{
		//static method doesn't allowed to call instant method without object creation
		System.out.println("methodC executed");
		
		//Syntax to call instant method with in static method
		//new Classname().methodname();
		new CallingMethods().methodA();
		new CallingMethods().methodB();
	}

	public static void main(String[] args) 
	{
		
		/*
		 * static:--> Static is a access specifier
		 * 			=> It specifies only static methods allowed
		 * 				directly to call without object creation
		 * 			=> Other than static methods we must call
		 * 				using object creation
		 */
		new CallingMethods().methodA();
		new CallingMethods().methodB();
		
	}

}
