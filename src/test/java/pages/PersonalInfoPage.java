package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class PersonalInfoPage {
	
	public static final String expValue = "123 St Alphonse Ave Ste Anne, MB, R5H 1H9";
	
	
	//Locate all DOM's
	
	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(id = "lastName")
	WebElement lastname;
	
	@FindBy(id = "dateOfBirth")
	WebElement dob;
	
	@FindBy(id = "mobileNumber")
	WebElement personphone;
	
	@FindBy(id = "email")
	WebElement personemail;
	
	@FindBy(id = "occupation")
	WebElement occup;
	
	@FindBy(id = "occupationDetails")
	WebElement occupdetail;
	
	@FindBy(xpath = "//input[@name='streetAddress1']")
	WebElement personaddress;
	
	@FindBy(id = "applicationBtn")
	WebElement nextBtn;
	
	public PersonalInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void personactions() {
		firstname.sendKeys("RODNEY");
		lastname.sendKeys("LAPLANT");
		dob.sendKeys("1979/01/02");
		personphone.sendKeys("4162272345");
		personemail.sendKeys("tmxpass@bmo.com");
	}
	
	public void personoccupation() {
		Select singleSel = new Select(occup);
		singleSel.selectByIndex(5);
		occupdetail.sendKeys("test");
	}
	
	public void personaladdress() throws Exception {
		personaddress.sendKeys("123 st ave");
		List <WebElement> items = TestBase.getDriver().findElements(By.xpath("//li[@class='font-size-small']"));
		for(WebElement item : items) {
			if(item.getText().equalsIgnoreCase(expValue)) {
				item.click();
				break;
			}
		}
		Thread.sleep(10000);
		nextBtn.click();
	}
	
	

}
