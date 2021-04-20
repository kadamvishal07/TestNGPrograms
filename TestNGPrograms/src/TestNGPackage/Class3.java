package TestNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 {
	
	@BeforeSuite
	public void class3BeforeSuite()
	{
		System.out.println("This is class3 Before Suite");
	}
	
	@Test 
	public void class3Method1()
	{
		System.out.println("This is class3Method1 ");
	}
	@Test
	public void class3Method2()
	{
		System.out.println("This is class3Method2 ");
	}
	@Test (groups = {"smoke"})
	public void class3Method3()
	{
		System.out.println("This is class3Method3 ");
	}
	
	@AfterSuite
	public void class3AfterSuite()
	{
		System.out.println("This is class3 After Suite");
	}
}
