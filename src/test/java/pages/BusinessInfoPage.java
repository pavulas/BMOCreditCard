package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class BusinessInfoPage {
	
	public static final String expValue = "12 Main Dam Rd Deer Lake, NL, A8A 1S2";
	
	
	// Locate all DOM's
	
	@FindBy(xpath = "//select[@id='officialLanguage']")
	WebElement langdropdown;
	
	@FindBy(id = "businessPhone")
	WebElement busphone;
	
	@FindBy(id = "businessEmail")
	WebElement busemail;
	
	@FindBy(id = "businessSince")
	WebElement bussince;
	
	@FindBy(xpath = "//input[@name='streetAddress1']")
	WebElement busaddress;
	
	@FindBy(id = "industry")
	WebElement industrydropdown;
	
	@FindBy(id = "subIndustry")
	WebElement subindustrydropdown;
	
	@FindBy(id = "applicationBtn")
	WebElement appbtn;
	
	public BusinessInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Action methods
	
	public void language() {
		
		Select singleSel = new Select(langdropdown);
		singleSel.selectByIndex(1);
	}
	
	public void businfopg() {
		
		busphone.sendKeys("9440800109");
		busemail.sendKeys("we@w.com");
		bussince.sendKeys("2000/02/01");
	}
	
	public void businessaddress() throws Exception {
		busaddress.sendKeys("12 main");
		Thread.sleep(3000);
		List<WebElement> addresses = TestBase.getDriver().findElements(By.xpath("//li[@class='font-size-small']"));
		for(WebElement address : addresses) {
			if(address.getText().equalsIgnoreCase(expValue)) {
				address.click();
				break;
			}
		}
		
	}
	
	public void industry() {
		Select industry1 = new Select(industrydropdown);
		industry1.selectByIndex(3);
	}
	public void subindustry() {
		Select industry2 = new Select(subindustrydropdown);
		industry2.selectByIndex(2);
	}
	
	public void continuebutton() {
		appbtn.click();
	}

}
