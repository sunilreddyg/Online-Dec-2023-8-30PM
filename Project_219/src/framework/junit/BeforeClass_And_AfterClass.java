package framework.junit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeClass_And_AfterClass 
{

	@BeforeAll //Invoke before first @Test annotated method
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class Precondition");
	}

	@AfterAll //Invoke after last @Test annotated method
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
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
