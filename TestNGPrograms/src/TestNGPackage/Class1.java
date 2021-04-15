package TestNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeMethod
	public void class1BeforeMethod()
	{
		System.out.println("This is class1 Before Method ");
	}
	
	@Test
	public void class1Method1()
	{
		System.out.println("This is class1Method1 ");
	}
	@Test(groups = {"smoke"})
	public void class1Method2()
	{
		System.out.println("This is class1Method2 ");
	}
	@Test
	public void class1Method3()
	{
		System.out.println("This is class1Method3 ");
	}
	
	@AfterMethod
	public void class1AfterMethod()
	{
		System.out.println("This is class1 After Method ");
	}

}
