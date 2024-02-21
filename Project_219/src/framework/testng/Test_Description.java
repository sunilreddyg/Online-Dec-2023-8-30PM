package framework.testng;

import org.testng.annotations.Test;

public class Test_Description 
{
	@Test(priority=2,description = "Trying to open chrome browser")
	public void BrowserOpen()
	{
		
	}
	
	@Test(priority=0,description="Opening FB url")
	public void AppOpen()
	{
		
	}
	
	@Test(priority=1)
	public void TakeScreen()
	{
		//Enabled property ignored test method to run
	}
}
