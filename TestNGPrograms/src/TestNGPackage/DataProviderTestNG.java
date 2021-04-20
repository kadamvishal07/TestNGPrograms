package TestNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	@BeforeSuite
	public void DataProviderBeforeSuite()
	{
		System.out.println("This is DataProvider Before Suite");
	}
	
	@Test 
	public void DataProviderMethod1()
	{
		System.out.println("This is DataProviderMethod1 ");
	}
	
	
	@Test (dataProvider = "dataProviderMethod")
	public void DataProviderMethod2(String un, String pswd)
	{
		System.out.println("This is DataProviderMethod2 ");
		System.out.println(un);
		System.out.println(pswd);
	}
	@Test (groups = {"smoke"})
	public void DataProviderMethod3()
	{
		System.out.println("This is DataProviderMethod3 ");
	}
	
	@AfterSuite
	public void DataProviderAfterSuite()
	{
		System.out.println("This is DataProvider After Suite");
	}
	
	@DataProvider
	public Object[][] dataProviderMethod()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPassword";
		
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdUserName";
		
		return data;
	}
}
