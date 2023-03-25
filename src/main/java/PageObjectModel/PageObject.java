package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

	WebDriver driver;

	
	//Login
	public By username = By.xpath("//input[@id='username']");
	public By password = By.xpath("//input[@id='password']");
	public By condition = By.xpath("//input[@id='remember-me']");
	public By login = By.xpath("//button[@id='submit']");
	public By errors=By.xpath("//a[@id='home-menu-item']");
	public By errors1=By.xpath("//strong[contains(text(),'User Name')]");
	public By signup=By.xpath("//a[normalize-space()='Sign Up Here']");
	
	
	//register
	public By title = By.xpath("//select[@name='title']");
	public By firstname = By.xpath("//input[@id='firstName']");
	public By lastname = By.xpath("//input[@id='lastName']");
	public By gender = By.xpath("(//input[@type='radio'])[1]");
	public By dob = By.xpath("//input[@id='dob']");
	public By social = By.xpath("//input[@id='ssn']");
	public By mail = By.xpath("//input[@id='emailAddress']");
	public By pass = By.xpath("//input[@id='password']");
	public By pass1 = By.xpath("//input[@id='confirmPassword']");
	public By next = By.xpath("//button[@type='submit']");
	public By add = By.xpath("//input[@id='address']");
	public By localty=By.xpath("//input[@id='locality']");
	public By region=By.xpath("//input[@id='region']");
	public By postal=By.xpath("//input[@id='postalCode']");
	public By country=By.xpath("//input[@id='country']");
	public By homeph=By.xpath("//input[@id='homePhone']");
	public By mobileph=By.xpath("//input[@id='mobilePhone']");
	public By workph=By.xpath("//input[@id='workPhone']");
	public By term=By.xpath("//input[@id='agree-terms']");
	public By register=By.xpath("//button[@type='submit']");
	public By error=By.xpath("//span[contains(text(),'An account is already registered with the Social Security Number provided. Login with the existing account or provide another social security number.')]");

	//BankAccout
	public By checking=By.xpath("//a[@id='checking-menu']");
	public By view=By.xpath("//a[@id='view-checking-menu-item']");
	public By contine=By.xpath("//button[normalize-space()='Continue']");
	public By standred=By.xpath("//input[@id='Standard Checking']");
	public By type=By.xpath("//input[@id='Individual']");
	public By accountname=By.xpath("//input[@id='name']");
	public By deposit=By.xpath("//input[@id='openingBalance']");
	public By submit1=By.xpath("//button[@id='newCheckingSubmit']");
	public By deposit1=By.xpath("//a[@id='deposit-menu-item']");
	public By acctype=By.xpath("//select[@id='selectedAccount']");
	public By deposit2=By.xpath("//input[@id='amount']");
	public By submit2=By.xpath("//button[normalize-space()='Submit']");
	public By withdraw=By.xpath("//a[@id='withdraw-menu-item']");
	public By saving=By.xpath("//a[@id='savings-menu']");
	public By viewsaving=By.xpath("//a[@id='view-savings-menu-item']");
	public By savingtype=By.xpath("//input[@id='Savings']");
	public By submit3=By.xpath("//button[@id='newSavingsSubmit']");
	
	public By transfer=By.xpath("//a[@id='transfer-menu-item']");
	public By fromacc=By.xpath("//select[@id='fromAccount']");
	public By toacc=By.xpath("//select[@id='toAccount']");
	public By asserts=By.xpath("//strong[@class='card-title text-light']");
	
	
	public PageObject(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public WebElement enterusername() {

		return driver.findElement(username);
	}

	public WebElement enterpassword() {

		return driver.findElement(password);
	}
	
	public WebElement entercondton() {

		return driver.findElement(condition);
	}
	
	public WebElement clicklogin() {

		return driver.findElement(login);
	}
	
	public WebElement verifyerrors() {

		return driver.findElement(errors);
	}
	
	public WebElement verifyerrors1() {

		return driver.findElement(errors1);
	}
	
	
	public WebElement clicksignup() {

		return driver.findElement(signup);
	}

	public WebElement entertitle() {

		return driver.findElement(title);
	}

	public WebElement enterfirstname() {

		return driver.findElement(firstname);
	}

	public WebElement enterlastname() {

		return driver.findElement(lastname);
	}

	public WebElement entergender() {

		return driver.findElement(gender);
	}

	public WebElement enterdob() {

		return driver.findElement(dob);
	}

	public WebElement entersocial() {

		return driver.findElement(social);
	}

	public WebElement enteremail() {

		return driver.findElement(mail);
	}

	public WebElement enterpass() {

		return driver.findElement(pass);
	}

	public WebElement enterpass1() {

		return driver.findElement(pass1);
	}

	public WebElement clicknext() {

		return driver.findElement(next);
	}

	public WebElement enteradd() {

		return driver.findElement(add);
	}
	
	public WebElement enterlocality() {

		return driver.findElement(localty);
	}
	
	public WebElement enterregion() {

		return driver.findElement(region);
	}
	
	public WebElement enterpostal() {

		return driver.findElement(postal);
	}
	
	public WebElement entercountry() {

		return driver.findElement(country);
	}
	
	public WebElement enterhome() {

		return driver.findElement(homeph);
	}
	
	public WebElement entermobile() {

		return driver.findElement(mobileph);
	}
	
	public WebElement enterwork() {

		return driver.findElement(workph);
	}

	public WebElement enterterm() {

		return driver.findElement(term);
	}
	
	public WebElement clickregister() {

		return driver.findElement(register);
	}
	
	public WebElement verifyerror() {

		return driver.findElement(error);
	}
	
	public WebElement clickchecking() {

		return driver.findElement(checking);
	}
	
	public WebElement clickview() {

		return driver.findElement(view);
	}
	
	public WebElement clickcontinue() {

		return driver.findElement(contine);
	}
	
	public WebElement clickstandred() {

		return driver.findElement(standred);
	}
	
	public WebElement clicktype() {

		return driver.findElement(type);
	}
	
	public WebElement enteracoutname() {

		return driver.findElement(accountname);
	}
	
	public WebElement enterdeposit() {

		return driver.findElement(deposit);
	}
	
	public WebElement clicksubmit1() {

		return driver.findElement(submit1);
	}
	
	public WebElement clickdeposit1() {

		return driver.findElement(deposit1);
	}
	
	public WebElement verifyacctype() {

		return driver.findElement(acctype);
	}
	
	public WebElement enterdeposit2() {

		return driver.findElement(deposit2);
	}
	
	public WebElement clicksubmit2() {

		return driver.findElement(submit2);
	}
	
	public WebElement clickwithdraw() {

		return driver.findElement(withdraw);
	}
	
	public WebElement clicksaving() {

		return driver.findElement(saving);
	}
	
	public WebElement clickviewsaving() {

		return driver.findElement(viewsaving);
	}
	
	public WebElement verifysavingatype() {

		return driver.findElement(savingtype);
	}
	
	public WebElement clicksubmit3() {

		return driver.findElement(submit3);
	}
	
	public WebElement clicktransfer() {

		return driver.findElement(transfer);
	}
	
	public WebElement clickfromacc() {

		return driver.findElement(fromacc);
	}
	
	public WebElement clicktoacc() {

		return driver.findElement(toacc);
	}
	
	public WebElement verifyasserts() {

		return driver.findElement(asserts);
	}
}
