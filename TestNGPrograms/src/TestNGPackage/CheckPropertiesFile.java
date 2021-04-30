package TestNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CheckPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Java_Selenium\\Git\\TestNGPrograms\\TestNGPrograms\\src\\TestNGPackage\\data.properties");
		Properties prop = new Properties();
		
		//Read File
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Java_Selenium\\Git\\TestNGPrograms\\TestNGPrograms\\src\\TestNGPackage\\data.properties");
		
		//Write to File
		prop.store(fos, null);
		

	}

}
