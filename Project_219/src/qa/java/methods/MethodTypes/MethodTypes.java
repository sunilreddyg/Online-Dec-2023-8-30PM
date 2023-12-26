package qa.java.methods.MethodTypes;

public class MethodTypes {
	
	
	//Void type [It doesn't return any value]
	public void method1()
	{
		String name="WebDriver";
	}
	
	
	/*
	 * 1. Other than void all method types return values
	 * 2. Return value should match with method type
	 * 3. We should write return keyword at the end of the method
	 * 4. It Return value to method name
	 */
	
	public String method2()
	{
		String name="WebDriver";  //Local Variable
		return name;
	}
	
	
	//boolean return type method
	public boolean method3(int a, int b)
	{
		return a>b;  //Greater than symbol return boolean value
	}
	
	//integer return type method
	public int method4(int a, int b)
	{
		return a*b;  // * symbol multiply two integer values
	}
	
	//double return type method
	public double method5()
	{
		return 1500.00;
	}

	public static void main(String[] args) {
		
		MethodTypes obj=new MethodTypes();
		obj.method1();  //Calling void return method
		
		//Calling string return method
		String toolname=obj.method2();
		System.out.println(toolname);
		
		//Calling boolean return method
		boolean flag=obj.method3(10, 50);
		System.out.println(flag);
		
		//Calling integer return method
		int val=obj.method4(10, 20);
		System.out.println(val);
		
		//Calling double return method
		double price=obj.method5();
		System.out.println(price);
		
	}

}
