package qa.java.methods;

public class TvRemote 
{
	//Reusable method
	public void turnon()   //()method parameters
	{
		System.out.println("turned on");
	}
	
	//Reusable method
	public void turnoff() 
	{
		System.out.println("turned off");
	}
	
	public static void main(String[] args) 
	{
		new TvRemote().turnon();
		new TvRemote().turnoff();
	}
	

}
