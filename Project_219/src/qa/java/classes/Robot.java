package qa.java.classes;


public class Robot 
{
	//Reusable method
	public static void getMobilename() 
	{
		System.out.println("Iphone");
	}
	
	//Reusable method
	public static void getPrice() 
	{
		System.out.println(5000.00);
	}
	
	public static void main(String[] args) 
	{
		//Main method allowed to write direct statements
		System.out.println("Print Mobile Details");
		
		//Calling methods [Main method allowed to run functions or methods]
		getMobilename();
		getPrice();
	}
	

}
