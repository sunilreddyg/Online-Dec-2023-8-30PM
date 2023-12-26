package qa.java.variable.initiation;

public class Method_initializer 
{
	
	String name;  //Global Variable
	
	public void methodA()
	{
		name="WeBDriver";  
		//Once globally initiated , Don't initiate locally again
	}

	public static void main(String[] args) 
	{
		Method_initializer obj=new Method_initializer();
		System.out.println(obj.name);
		
		obj.methodA();
		
		System.out.println(obj.name);

	}

}
