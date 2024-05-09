package pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TermsConditionsPage {

	//Locate all DOM's
	
	@FindBy(xpath = "//a[@role='button']")
	WebElement termslink;
	
	@FindBy(id = "acceptTermCondt")
	WebElement termscheckbox;
	
	@FindBy(id = "applicationBtn")
	WebElement nextstepbtn2;
	
	public TermsConditionsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void terms() throws Exception {
		
		Actions actions = new Actions(TestBase.getDriver());
		actions.moveToElement(termslink).click();
		String parentwin = TestBase.getDriver().getWindowHandle();
		Set<String> tabs = TestBase.getDriver().getWindowHandles();
		for (String child : tabs) {
			if(!child.equalsIgnoreCase(parentwin)) {
				TestBase.getDriver().switchTo().window(child);
			}
		}
		Thread.sleep(4000);
		TestBase.getDriver().close();
		TestBase.getDriver().switchTo().window(parentwin);
		
		Thread.sleep(4000);
		actions.moveToElement(termscheckbox).perform();
		JavascriptExecutor js1 = (JavascriptExecutor)TestBase.getDriver();
		js1.executeScript("arguments[0].click();", termscheckbox);
		nextstepbtn2.click();
	}
	
}
