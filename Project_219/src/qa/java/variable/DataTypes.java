package qa.java.variable;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		/*
		 * byte:-->
		 * 			=> byte is a numeric datatype
		 * 			=> Default value is 0
		 * 			=> Min value is -128  
		 * 			=> Maximum value is 127
		 */
		byte a=127;
		System.out.println("Byte value is  "+a);
	
	
		/*
		 * short:-->
		 * 			=> short is a numeric datatype
		 * 			=> Default value is 0
		 * 			=> Min value is -32,768 
		 * 			=> Maximum value is 32,767
		 */
		short b=32767;
		System.out.println("short value is --> "+b);
	
	
		/*
		 * int:-->
		 * 		=>  int is a numeric datatype
		 * 		=>  Default value is 0
		 * 		=> Recomended always int to store numeric values
		 * 		=> Int min and maximum values -2,147,483,648 to 2,147,483, 647
		 */
		int x=100;
		int y=200;
		int z=x+y; //Here + is a operator conduction addition between two numbers
		System.out.println("total is -->"+z);  //Here + is club the two values
		
		
		
		/*
		 * boolean:-->
		 * 			=> boolean store true/false value
		 * 			=> default value of boolean is false
		 */
		boolean flag=true;
		boolean status=false;
		System.out.println("flag value is -> "+flag);
		System.out.println("status  is ->"+status);
		
		
		/*
		 * double:-->
		 * 		=> Double accept decimal values to store
		 * 		=> Default value of double is 0
		 */
		double selenium_version=3.14;
		double price=25000.50;
		double cost=100;
		System.out.println("Version is --> "+selenium_version);
		System.out.println("Price is --> "+price);
		System.out.println("Cost is ---. "+cost);
		
		
		
		
		/*
		 * float:-->
		 * 		=> Float accept decimal values same as double
		 * 		=> Float value should end with f character
		 * 		=> default value is 0
		 */
		float f=1234.12f;
		System.out.println("float value is ---> "+f);
		
		
		/*
		 * char:-->
		 * 			=> Accept only single character
		 * 			=> Only store single character in single quotes
		 * 			=> Default value is null
		 */
		char group='A';
		char group1='B';
		System.out.println("group value is -->"+group);
		System.out.println("group1 value is -->"+group1);
		
		
	
		/*
		 * String:-->
		 * 			=> String is a non-primitive datatype
		 * 			=> String starts with Uppercase characters
		 * 			=> String allow to store set of characters
		 * 			=> String data stored in double quotes
		 * 			=> Default value is null.
		 * 			=> string also called as class because it contains
		 * 				set of events.
		 */
		
		String name="sunil";
		String mobile="9030248855";
		String email="sunilreddy.gajjala@gmail.com";
	
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(email);
		
		//printing mobile length
		System.out.println(mobile.length());
		
		
	}

}
