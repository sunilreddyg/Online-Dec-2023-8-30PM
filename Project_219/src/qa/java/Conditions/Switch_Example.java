package qa.java.Conditions;


public class Switch_Example {

	public static void main(String[] args) 
	{
		
		/*
		 * switch-case:-->
		 * 			It is similar to  else if condition. But only
		 * 			difference switch execute only require case instead
		 * 			of checking every condition.
		 */
		
		
		String month="apr";
		
		switch (month) 
		{
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;
			
		case "mar":
			System.out.println("30% Discount");
			break;
			
		case "apr":
			System.out.println("40% Discount");
			break;

		default: System.out.println("no month matches");
			break;
		}
		
		
		//Switch using numeric keys
		int mnth=3;
		
		switch (mnth) 
		{
		case 1:
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
			
		case 3:
			System.out.println("Mar");
			break;

		default:System.out.println("numer is mismatch");
			break;
		}
		
		
		

	}

}
