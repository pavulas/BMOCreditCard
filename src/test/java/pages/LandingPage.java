package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	//Locate all DOMs
	
	@FindBy(xpath = "//button[@class='primary']")
	WebElement contBtn;
	
	@FindBy(xpath = "(//label[@class='box-radio-label'])[2]")
	WebElement alreadyBMOCardBtn;
	
	@FindBy(xpath = "(//label[@class='box-radio-label'])[3]")
	WebElement soleOwnerBtn;
	
	@FindBy(xpath = "//label[text()='Sole Proprietor']")
	WebElement solepropBtn;
	
	@FindBy(xpath = "(//label[@class='box-radio-label'])[5]")
	WebElement transactionBtn;
	
	@FindBy(xpath = "//button[@class='primary']")
	WebElement contBtn1;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	
	public void beforestartpage() {
		contBtn.click();
	}
	public void Btn1()  {
		alreadyBMOCardBtn.click();
	}
	public void Btn2() {
		soleOwnerBtn.click();
	}
	public void Btn3() {
		solepropBtn.click();
	}
	public void Btn4() {
		transactionBtn.click();
	}
	public void Btn5() {
		contBtn1.click();
	}
	
	

}
