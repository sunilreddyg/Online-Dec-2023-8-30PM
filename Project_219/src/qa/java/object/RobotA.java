package qa.java.object;

public class RobotA 
{

	public RobotA() 
	{
		System.out.println("Power ON");
	}
	
	
	public void startwalking() 
	{
		System.out.println("Walking Started");
	}
	
	public void increasespeed() 
	{
		System.out.println("Speed Increased");
	}

	public static void main(String[] args) 
	{
		  /*
		   * Object Creation Syntax
		   * 	Classname obj=new Classname();
		   * 	obj.methodname;
		   * 	Datatype ref=obj.Variablename;
		   */
		
	      RobotA obj=new RobotA();
	      obj.startwalking();
	      obj.increasespeed();

	}

}
