package Resourses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void hadnleassertion(String actual, String expected, String message)  {
		
		SoftAssert sa=new SoftAssert();
		
		String ac=actual;
		String ep=expected;
		
		sa.assertEquals(ac, ep, message);
		
		sa.assertAll();
	}
	
	public static void handleselecttag(WebElement a, int index)   {
		
		Select s=new Select(a);
		
		s.selectByIndex(index);
		
		
		
	}

}
