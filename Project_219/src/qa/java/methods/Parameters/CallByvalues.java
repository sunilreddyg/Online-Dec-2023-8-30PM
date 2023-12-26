package qa.java.methods.Parameters;

public class CallByvalues 
{
	
	//method without parameter
	public void method1()
	{
		System.out.println("Method Don't have parameter");
	}
	
	//Method with String parameter
	public void method2(String name)
	{
		System.out.println(name);
	}
	
	//Method with int parameter
	public void method3(int num)
	{
		System.out.println(num);
	}

	public static void main(String[] args) 
	{
		
		//Class Object
		CallByvalues obj=new CallByvalues();
		obj.method1();
		
		//Calling method with String argument
		obj.method2("Iphone");
		
		//Calling method with integer argument
		obj.method3(100);
	}

}
