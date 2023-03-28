package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.PageObject;
import Resourses.BAseClass;
import Resourses.CommonMethod;
import Resourses.ConstantMethod;
import org.apache.logging.log4j.*;

public class VerifyRegister extends BAseClass{
	
	
	@Test
	public void verifyregister()   {
		
	//	Logger log=LogManager.getLogger(VerifyRegister.class);
		
		PageObject obj=new PageObject(driver);
		
		obj.clicksignup().click();
		
	//	Select s=new Select(obj.entertitle());
	//	s.selectByIndex(1);
		CommonMethod.handleselecttag(obj.entertitle(), 1);
		obj.enterfirstname().sendKeys(ConstantMethod.firstname);
	//	log.info("enter firstname");
		obj.enterlastname().sendKeys(ConstantMethod.lastname);
	//	log.info("enter lastname");
		obj.entergender().click();
	//	log.info("click");
		obj.enterdob().sendKeys(ConstantMethod.dob);
	//	log.info("enter dob");
		obj.entersocial().sendKeys(ConstantMethod.ssn);
	//	log.info("enter social");
		obj.enteremail().sendKeys(ConstantMethod.email);
	//	log.info("enter mail");
		obj.enterpass().sendKeys(ConstantMethod.password);
	//	log.info("enter password");
		obj.enterpass1().sendKeys(ConstantMethod.password);
	//	log.info("enter password1");
		obj.clicknext().click();
	//	log.info("click1");
		CommonMethod.hadnleassertion(obj.verifyerror().getText(), ConstantMethod.error, "assertion is fail");
	//	log.info("verify assertion");
	/*	obj.enteradd().sendKeys(ConstantMethod.Add);
		obj.enterlocality().sendKeys(ConstantMethod.local);
		obj.enterregion().sendKeys(ConstantMethod.region);
		obj.enterpostal().sendKeys(ConstantMethod.pin);
		obj.entercountry().sendKeys(ConstantMethod.cuntry);
		obj.enterhome().sendKeys(ConstantMethod.home);
		obj.entermobile().sendKeys(ConstantMethod.mobile);
		obj.enterwork().sendKeys(ConstantMethod.work);
		obj.enterterm().click();
		obj.clickregister().click();   */
		
		
		
	
	}
	         

}


/*	obj.clickregister().click();
obj.enterfirstname().sendKeys(ConstantMethod.firstname);
obj.enterlastanme().sendKeys(ConstantMethod.lastname);
obj.enteradd().sendKeys(ConstantMethod.Add);
obj.entercity().sendKeys(ConstantMethod.city);
obj.enterstate().sendKeys(ConstantMethod.state);
obj.enterpin().sendKeys(ConstantMethod.pin);
obj.enterphone().sendKeys(ConstantMethod.tepele);
obj.enterssn().sendKeys(ConstantMethod.ssn);
obj.enteruser().sendKeys(ConstantMethod.user);
obj.enterpass().sendKeys(ConstantMethod.password);
obj.enterconfrm().sendKeys(ConstantMethod.password);
obj.clicksubmit().click();
//	Alert alt=driver.switchTo().alert();                     //user - mkdcvh234@4567561
//	System.out.println(alt.getText());                       //pass - Sumit123@4
//	alt.accept();

obj.enteruser1().sendKeys(ConstantMethod.user);
obj.enterpass1().sendKeys(ConstantMethod.password);
obj.clicklogin().click();

CommomMethod.hadnleassertion(obj.verifyassert().getText(), "Welcome ravi patel", "fail");  */