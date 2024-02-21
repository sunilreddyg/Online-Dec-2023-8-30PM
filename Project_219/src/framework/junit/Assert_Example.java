package framework.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;





public class Assert_Example 
{
	
	@Test
	public void tc001()
	{
		Assert.assertEquals("login", "login");
		System.out.println("tc001 Succesful");
		
	}
	
	@Test
	public void tc002()
	{
		Assert.assertEquals(10,20);
		System.out.println("Values are equal");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertEquals(10,10);
		System.out.println("Values are equal");
	}
	
	@Test
	public void tc004()
	{
		Assert.assertNotEquals(20, 30);
		System.out.println("Values are not equal");
	}
	
	@Test
	public void tc005()
	{
		Assert.assertTrue("sunil".contains("hi"));
		System.out.println("Required COntains");
	}

}
