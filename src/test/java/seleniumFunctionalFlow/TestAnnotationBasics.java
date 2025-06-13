package seleniumFunctionalFlow;

import org.testng.annotations.Test;

public class TestAnnotationBasics {
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("depends on test method");
		System.out.println(10/1);
	}
	
	@Test(invocationCount = 5,description = "basic test",dependsOnMethods = "test1",enabled = true,priority = 2)
	public void test()
	{
		System.out.println("test");
	}
	
	@Test(priority = 3)
	public void test2()
	{
		System.out.println("Priority");
	}

}
