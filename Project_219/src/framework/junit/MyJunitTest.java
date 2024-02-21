package framework.junit;


import org.junit.jupiter.api.Test;

class MyJunitTest 
{

	@Test  //invoke method to run without object creation and main method
	void test1() 
	{
		System.out.println("Test executed");
	}
	
	@Test
	void test2()
	{
		System.out.println("test2 executed");
	}
	

	@Test
	void test3()
	{
		System.out.println("test3 executed");
	}

}
