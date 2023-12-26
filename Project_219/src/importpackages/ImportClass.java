package importpackages;

import qa.java.methods.TvRemote;
import qa.java.constructor.UseClutch;
import qa.java.methods.CallingMethods;
import qa.java.methods.InstantMethods;
import qa.java.methods.StaticMethods;


public class ImportClass 
{

	public static void main(String[] args) {
		
		//Creating class object
		CallingMethods call=new CallingMethods();
		call.methodA();
		call.methodB();
		
		//Creating class object
		TvRemote tv=new TvRemote();
		tv.turnoff();
		tv.turnon();
		
		//Calling static methods
		StaticMethods.methodA();
		
		//Class object
		new InstantMethods().method1();
		new InstantMethods().method2();
		
		
		UseClutch use=new UseClutch();
		use.changetofirst();
		
		
		
	}

}
