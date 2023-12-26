package qa.java.variable;

public class Final_In_Variable 
{
	
	String url="http://google.com";

	public static void main(String[] args) 
	{
		Final_In_Variable obj=new Final_In_Variable();
		obj.url="http://facebook.com";
		System.out.println(obj.url);
		
	}

}
