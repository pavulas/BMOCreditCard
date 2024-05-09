package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPage {
	
	//Locate all DOM's
	
	@FindBy(id = "otp")
	WebElement otppwd;
	
	@FindBy(xpath = "(//button[text()='NEXT STEP'])[2]")
	WebElement nextstepbtn;
	
	public OTPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void otpvalidation() {
		otppwd.sendKeys("111111");
		nextstepbtn.click();
	}
	
	

}
