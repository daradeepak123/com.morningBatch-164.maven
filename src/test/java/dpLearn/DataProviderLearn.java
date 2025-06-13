package dpLearn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {
	
	@DataProvider(name="dp")
	public Object[][] dataaaProvider()
	{
		
	
		 return new Object[][] { { "testuser_1", "Test@123","150","abc",50 },
			 					 { "testuser_1", "Test@123","testparameter","abc",0 },
			 					 { "testuser_2", "Test@123","test2parameter","abc",500 } };
	
	}
	
	@Test(dataProvider = "dp",enabled=true)
	public void dataRead(String ss,String sss,String s,String xyz,int a)
	{
		System.out.println("This is 1 set of data "+ss);
		System.out.println("This is 2 set of data "+sss);
		System.out.println("This is 3 set of data "+s);
		System.out.println("This is 4 set of data "+xyz);
		System.out.println("This is 5 set of data "+a);
		System.out.println("Test execution completed ");
		//getDataReturn("C:\\demo\\employee.xlsx","Sheet1");
		//getData("C:\\demo\\employee.xlsx","Sheet1");
	}

}
