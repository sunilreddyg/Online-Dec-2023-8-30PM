package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  @Test //Invoke test to run
  public void tc001() 
  {
	  Reporter.log("tc001 executed");
  }
  
  @Test //Invoke test to run
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed");
  }
  
  @Test //Invoke test to run
  public void tc003() 
  {
	  Reporter.log("Tc003 executed");
  }
}
