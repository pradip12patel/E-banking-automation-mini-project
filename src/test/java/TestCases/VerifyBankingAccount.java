package TestCases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import PageObjectModel.PageObject;
import Resourses.BaseClass;
import Resourses.CommonMethod;
import Resourses.ConstantMethod;

public class VerifyBankingAccount extends BaseClass {
	
	@Test
	public void verify()     {
		
		Logger log=LogManager.getLogger(VerifyBankingAccount.class);
		
		PageObject obj=new PageObject(driver);
		
	//Signin
		obj.enterusername().sendKeys(ConstantMethod.email);
		obj.enterpassword().sendKeys(ConstantMethod.password);
		obj.entercondton().click();
		obj.clicklogin().click();
		log.fatal("this is fatal level log");
		log.warn("this is worning log");
		log.info("pass signin");
	/*	obj.clickchecking().click();
		obj.clickview().click();
	//	obj.clickcontinue().click();
		obj.clickstandred().click();
		obj.clicktype().click();
		obj.enteracoutname().sendKeys("ravi");
		obj.enterdeposit().sendKeys("500");
		obj.clicksubmit1().click();     */
		
	//deposit
		obj.clickdeposit1().click();
		CommonMethod.handleselecttag(obj.verifyacctype(), 1);
		obj.enterdeposit2().sendKeys(ConstantMethod.deposit1);
		obj.clicksubmit2().click();
		log.info("pass deposit");
		
	//Withdraw	
		obj.clickwithdraw().click();
		CommonMethod.handleselecttag(obj.verifyacctype(), 1);
		obj.enterdeposit2().sendKeys(ConstantMethod.deposit2);
		obj.clicksubmit2().click();
		log.info("pass withdraw");
		
	//saving account
		obj.clicksaving().click();
		obj.clickviewsaving().click();
	/*	obj.clickcontinue().click();
		obj.verifysavingatype().click();
		obj.clicktype().click();
		obj.enteracoutname().sendKeys("ravi");
		obj.enterdeposit().sendKeys("500");
		obj.clicksubmit3().click();    */
		log.info("pass saving");
		
	//Checking	
		obj.clickchecking().click();
		obj.clickview().click();
		log.info("pass checking");
		
	//Transfer
		obj.clicktransfer().click();
		CommonMethod.handleselecttag(obj.clickfromacc(), 1);
		CommonMethod.handleselecttag(obj.clicktoacc(), 2);
		obj.enterdeposit2().sendKeys(ConstantMethod.deposit3);
		obj.clicksubmit2().click();
		log.info("pass transfer");
		
		CommonMethod.hadnleassertion(obj.verifyasserts().getText(), ConstantMethod.asserts, "check the credentials");
		log.info("pass assert");
		
		
	}
	
	
	
	

}
