package qa.java.methods.Parameters;

public class Calculator 
{
	//Global variable
	int a;
	int b;

	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	public void add()
	{
		System.out.println(a+b);  //+ is a operator conduct addition between two numbers
	}
	
	public void mul()
	{
		System.out.println(a*b);   //*  is a operator conduct multiplications between two numbers
	}
	

	public static void main(String[] args) 
	{
		//Creating object for class
		new Calculator(10, 20).add();
		new Calculator(30, 10).mul();

	}

}
