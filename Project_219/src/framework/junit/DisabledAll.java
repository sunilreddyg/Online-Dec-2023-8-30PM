package framework.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledAll 
{
	
	@Test
	public void Tc001()
	{
		System.out.println("Tc001 Executed");
	}
	
	@Test
	public void Tc002()
	{
		System.out.println("Tc002 Executed");
	}

}
