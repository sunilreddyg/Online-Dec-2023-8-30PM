package framework.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeMethod_And_AfterMethod 
{

	@BeforeEach  //Invoke every @Test annotation before
	void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	@AfterEach   //Invoke every @Test annotation after
	void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
	}

	@Test  //Invoke test
	void test1() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Test  //Invoke test
	void test2()
	{
		System.out.println("test2 executed");
	}
	
	@Test  //Invoke test
	void test3()
	{
		System.out.println("test3 executed");
	}

}
