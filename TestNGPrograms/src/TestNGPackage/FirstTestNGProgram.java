package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTestNGProgram {
	
		@BeforeClass
		public void BeforeClassFirstTestNGProgram() 
		{
			System.out.println("First BeforeClassFirstTestNGProgram");
		}
	
		@Test
		public void demo() 
		{
			System.out.println("First TestNG program using @test annotation");
		}
		
		@AfterClass
		public void AfterClassFirstTestNGProgram() 
		{
			System.out.println("First AfterClassFirstTestNGProgram");
		}

}
