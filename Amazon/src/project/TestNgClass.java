package project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class methodddddd");
	}
    
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
	}
}
