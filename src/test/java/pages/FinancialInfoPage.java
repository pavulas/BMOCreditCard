package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FinancialInfoPage {
	
	//Locate all DOM's
	
	@FindBy(id = "source0")
	WebElement sourcedropdown;
	
	@FindBy(id = "annualSalary0")
	WebElement annualSal;
	
	@FindBy(id = "ownorrent0")
	WebElement own;
	
	@FindBy(id = "monthlyPayment0")
	WebElement monthlyPay;
	
	@FindBy(id = "annualSalesVal")
	WebElement busincome;
	
	@FindBy(xpath = "(//label[@class='box-radio-label'])[2]")
	WebElement debtbtn;
	
	@FindBy(id = "applicationBtn")
	WebElement nextstepbtn1;
	
	public FinancialInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Action Methods
	
	public void incomedropdown() {
		Select singleSel = new Select(sourcedropdown);
		singleSel.selectByIndex(1);
		annualSal.sendKeys("120000");
	}
	public void housingdropdown() {
		Select singleSel = new Select(own);
		singleSel.selectByIndex(0);
		monthlyPay.sendKeys("1000");
	}
	public void financials() {
		busincome.sendKeys("90000");
		debtbtn.click();
		nextstepbtn1.click();
	}
}
