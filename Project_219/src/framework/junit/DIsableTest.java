package framework.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DIsableTest 
{
	
	
	@Test
	public void tc001()
	{
		System.out.println("Tc001 Executed");
	}
	
	@Disabled
	public void tc002()
	{
		System.out.println("Tc002 Executed");
	}
	
	@Test
	public void tc003()
	{
		System.out.println("Tc003 Executed");
	}

}
