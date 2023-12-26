package qa.java.methods.Parameters;


public class SetSpeed 
{
	//constructor with parameter
	public SetSpeed(int kmps) 
	{
		System.out.println(kmps);
	}
	
	public void walk()
	{
		System.out.println("Walk Executed");
	}
	
	public void run()
	{
		System.out.println("Run executed");
	}
	
	

	public static void main(String[] args) 
	{
		//Create object to class
		new SetSpeed(20).walk();

	}

}
