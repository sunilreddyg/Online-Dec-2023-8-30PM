package qa.java.methods;

public class InstantMethods 
{
	
	public void method1()
	{
		System.out.println("method1 executed");
	}
	
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	public void method3() 
	{
		//With in class you can call methods without constructor
		method1();
		method2();
	}
	

	public static void main(String[] args) 
	{
		//Calling instant methods from main method
		//Syntax:--> new Classname().methodname();
		 new InstantMethods().method3();

	}

}
