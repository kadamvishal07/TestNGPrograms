package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@BeforeTest
	public void class2BeforeTest()
	{
		System.out.println("This is BeforeTest in Class2 ");
	}
	
	@Test
	public void class2Method1()
	{
		System.out.println("This is class2Method1 ");
	}
	@Test (groups = {"smoke"})
	public void class2Method2()
	{
		System.out.println("This is class2Method2 ");
	}
	@Test
	public void class2Method3()
	{
		System.out.println("This is class2Method3 ");
	}
	
	@AfterTest
	public void class2AfterTest()
	{
		System.out.println("This is AfterTest in Class2 ");
	}
}
