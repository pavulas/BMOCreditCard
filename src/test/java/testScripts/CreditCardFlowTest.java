package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BAQPage;
import pages.BusinessInfoPage;
import pages.FinancialInfoPage;
import pages.LandingPage;
import pages.OTPPage;
import pages.PersonalInfoPage;
import pages.TermsConditionsPage;

public class CreditCardFlowTest {
	
	WebDriver driver;
	LandingPage landingpage;
	BAQPage baqpage;
	BusinessInfoPage businfopage;
	PersonalInfoPage personalinfopage;
	OTPPage otppage;
	FinancialInfoPage financialpage;
	TermsConditionsPage termspage;
	
	
	public CreditCardFlowTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		landingpage = new LandingPage(driver);
		baqpage = new BAQPage(driver);
		businfopage = new BusinessInfoPage(driver);
		personalinfopage = new PersonalInfoPage(driver);
		otppage = new OTPPage(driver);
		financialpage = new FinancialInfoPage(driver);
		termspage = new TermsConditionsPage(driver);
	}
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() {
		TestBase.openURL("https://www.bmo.qa4.bmo.com/small-business/business-xpress/?AppType=CREDITCARD&ProductId=21&Name=BMOCashBackBusinessMastercard&Country=CA&Locale=EN");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
  
  @SuppressWarnings("deprecation")
@Test(priority=1)
  public void landingpg() {
	  landingpage.beforestartpage();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  landingpage.Btn1();

	  landingpage.Btn2();

	  landingpage.Btn3();

	  landingpage.Btn4();

	  landingpage.Btn5();

	  
  }
  @SuppressWarnings("deprecation")
@Test(priority=2)
  public void baqpg() {
	  baqpage.BAQbtns();

	  baqpage.BAQbtns1();

	  baqpage.BAQbtns2();

	  baqpage.textbx();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  baqpage.chkbox();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  baqpage.appbtn();
	  
	  
  }
  
  
@Test(priority=3)
  
  public void businesspg() throws Exception {
	  businfopage.language();
	  businfopage.businfopg();
	  
	  businfopage.businessaddress();
	  Thread.sleep(5000);
	  
	  businfopage.industry();
	  businfopage.subindustry();
	  
	  businfopage.continuebutton();
	  
  }
@Test(priority=4)

public void personalpg() throws Exception {
	personalinfopage.personactions();
	personalinfopage.personoccupation();
	personalinfopage.personaladdress();
	
}
@SuppressWarnings("deprecation")
@Test(priority=5)

public void otppg() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	otppage.otpvalidation();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@Test(priority=6)

public void financialpg() {
	financialpage.incomedropdown();
	financialpage.housingdropdown();
	financialpage.financials();
	
}
@Test(priority=7)

public void termspg() throws Exception {
	termspage.terms();
}
}
