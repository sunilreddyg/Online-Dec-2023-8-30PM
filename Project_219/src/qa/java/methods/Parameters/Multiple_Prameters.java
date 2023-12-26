package qa.java.methods.Parameters;

public class Multiple_Prameters 
{
	//No Parameters
	public void method1()
	{
		System.out.println("Welcome");
	}

	//Method with single parameter
	public void method2(String name)
	{
		String firstname=name;
		System.out.println(firstname);
	}
	
	//Multiple Parameters  [Sequence parameters]
	public void method3(String UID,String PWD)
	{
		System.out.println(UID);
		System.out.println(PWD);
	}
	
	//Different parameters
	public void method4(int items,double price)
	{
		System.out.println(items*price);
	}
	
	
	//Different parameters
	public void method4(int items,double price,String name)
	{
			System.out.println(items*price);
			System.out.println(name);
	}
	
	
	public static void main(String[] args) 
	{
		//Class object creation
		Multiple_Prameters obj=new Multiple_Prameters();
		obj.method1();
		obj.method2("Chrome");
		
		//Calling  method with multiple arguments
		obj.method3("sunil", "pwd@123");
		obj.method3("pwd@123", "sunil");

		obj.method4(5, 5000.00);
		
	}

}
