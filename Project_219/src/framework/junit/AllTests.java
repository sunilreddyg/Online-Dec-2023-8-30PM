package framework.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses
		({ 
			Assert_Example.class, 
			BeforeClass_And_AfterClass.class, 
			BeforeMethod_And_AfterMethod.class,
			DisabledAll.class, 
			DIsableTest.class, 
			MyJunitTest.class, 
			WebDriverTest.class 
		})
public class AllTests 
{

}
