package qa.java.methods;

public class StaticMethods 
{
	
	public static void methodA() 
	{
		System.out.println("methodA executed");
	}
	
	public static void methodB()
	{
		System.out.println("methodB executed");
	}

	public static void main(String[] args) 
	{
		//Calling static methods with in class
		methodA();
		methodB();
		
		//Calling static methods from different class
		//Syntax:--> Classname.methodname();
		StaticMethods.methodA();
		StaticMethods.methodB();

	}

}
