package TestNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@Test (enabled = false)
	public void testNGAnno1()
	{
		System.out.println("This is testNGAnno1");
	}
	
	@Test (dependsOnMethods = {"class3Method3", "class3Method2"})
	public void testNGAnno2()
	{
		System.out.println("This is testNGAnno2 ");
	}
	@Test
	public void testNGAnno3()
	{
		System.out.println("This is testNGAnno3 ");
	}
	@Test (groups = {"smoke"})
	public void testNGAnno4()
	{
		System.out.println("This is testNGAnno4 ");
	}
	
}
