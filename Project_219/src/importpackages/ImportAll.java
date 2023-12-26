package importpackages;

import qa.java.methods.*;
//  importing whole package


public class ImportAll 
{

	public static void main(String[] args) {
		
		//Creating class object
		TvRemote TV=new TvRemote();
		TV.turnon();
		TV.turnoff();
		
		//Calling static methods
		StaticMethods.methodA();
		StaticMethods.methodB();

	}

}
