package qa.java.Conditions;

public class IF_Condition {

	public static void main(String[] args) 
	{
		
		/*
		 * if:--> It is a single decison statement
		 */
		
		System.out.println("Statement1");
		
		int age=20;
		if (age > 18) 
		{
			System.out.println("Statement2");
		}
		
	
		System.out.println("Statement3");
		
		
		//Verify mobile number starts with required characters
		String mobile="9030248855";
		if(mobile.startsWith("+91"))
		{
			System.out.println(mobile.substring(3));
		}

		
		//if Condition without block
		boolean flag=false;
		if(flag)
			System.out.println("It's true"); 
		   
		
			
		
		
	}

}
