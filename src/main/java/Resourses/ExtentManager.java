package Resourses;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	

	
	public static ExtentReports extent;   //Responsible for entires
	public static ExtentTest test;       //Responsible for test status pass or fail
	public static ExtentSparkReporter htmlreporter;    //Responsible for look and Feel
	
	
		public static void setup()  {
			
			htmlreporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ResultReports/"+"Myreport_"+BAseClass.Getcurrenttime()+".html");
			htmlreporter.config().setDocumentTitle("Automation Report");
			htmlreporter.config().setReportName("functional Report");
			htmlreporter.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(htmlreporter);
			extent.setSystemInfo("host name", "Localhost");
			extent.setSystemInfo("os", "Window10");
			extent.setSystemInfo("testername", "test");
		}
		
		
        
		
		
		public static void endreport()   {
			
			extent.flush();
		}
	
		

}
