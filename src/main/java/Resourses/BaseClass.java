package Resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	protected WebDriver driver;
	Properties pro;
	
	public void DriverInitilize() throws IOException  {
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\data.properties");
	
	pro=new Properties();
	pro.load(file);
	
	      String key=pro.getProperty("browser");
	      
	      if(key.equalsIgnoreCase("chrome"))  {
	    	  
	    	  ChromeOptions op=new ChromeOptions();
		      op.addArguments("--remote-allow-origins=*"); 
	    	  
	    	 driver=new ChromeDriver(op); 
	    	  
	      }
	      else if(key.equalsIgnoreCase("firefox"))   {
	    	  
	    	 driver=new FirefoxDriver();
	      }
	      else {
	    	  
	    	  System.out.println("check the name first");
	      }
	}
	      
	      @BeforeMethod
	      public void openurl() throws IOException  {
	    	  
	    	  DriverInitilize();
	    	  
	    	  String key2=pro.getProperty("url");
	    	  
	    	  driver.get(key2);
	      }
	
	      @AfterMethod
	      public void closebrowser()  {
	    	  
	    	  driver.manage().window().maximize();
	      }
	
	
	
	
	
		
	
	

}
