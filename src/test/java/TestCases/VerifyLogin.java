package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.PageObject;
import Resourses.BAseClass;
import Resourses.CommonMethod;
import Resourses.ConstantMethod;

public class VerifyLogin extends BAseClass{
	
	
	@Test(dataProvider = "dataenter")
	public void verifylogin(String email,String password)  {
		
		Logger log=LogManager.getLogger(VerifyLogin.class);

		PageObject obj=new PageObject(driver);
		
		obj.enterusername().sendKeys(email);
		log.info("enter email");
		obj.enterpassword().sendKeys(password);
		log.info("enter password");
		obj.entercondton().click();
		log.info("condition click");
		obj.clicklogin().click();
		log.info("click login");
		
		try {
			
		CommonMethod.hadnleassertion(obj.verifyerrors1().getText(),ConstantMethod.errors1, "check correct credentials");
		log.info("handle assertion1");
		
		}
		catch(Exception e)   {
			
			CommonMethod.hadnleassertion(obj.verifyerrors().getText(),ConstantMethod.errors , "check the correct credentials");
			log.info("handle assertion2");
		}
	
	}
	
	
	 @DataProvider
     Object[][]    dataenter() {
     	
     	Object[][] data=new Object[2][2];
     	data[0][0]=ConstantMethod.email;
     	data[0][1]=ConstantMethod.password;
     	data[1][0]=ConstantMethod.email1;
     	data[1][1]=ConstantMethod.password1;
     
			return data;
	
	 }
  }
