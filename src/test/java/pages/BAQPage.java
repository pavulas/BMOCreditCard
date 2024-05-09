package pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class BAQPage {
	
	

	// Locate all DOM's

	@FindBy(xpath = "(//label[@class='box-radio-label'])[8]")
	WebElement BAQBtn1;

	@FindBy(xpath = "(//label[@class='box-radio-label'])[10]")
	WebElement BAQBtn2;

	@FindBy(xpath = "(//label[@class='box-radio-label'])[12]")
	WebElement BAQBtn3;

	@FindBy(xpath = "(//label[@class='box-radio-label'])[14]")
	WebElement BAQBtn4;

	@FindBy(id = "businessDetail")
	WebElement bustextbox;

//	@FindBy(xpath = "//label[contains(text(),'confirm')]/parent::div/input")
	@FindBy(xpath = "//input[@id='confirmAnswer']")
	WebElement checkbox;
	

	@FindBy(xpath = "(//button[@class='primary'])[2]")
	WebElement startappBtn;

	public BAQPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Action methods

	public void BAQbtns() {
		BAQBtn1.click();
		BAQBtn2.click();
	}

	public void BAQbtns1() {
//	  BAQBtn3.sendKeys(Keys.ARROW_DOWN);
		BAQBtn3.click();

	}

	public void BAQbtns2() {
//	  BAQBtn3.sendKeys(Keys.PAGE_DOWN);
		BAQBtn4.click();

	}

	public void textbx() {
		bustextbox.sendKeys("test 857687798");
	}

	public void chkbox() {
		Actions actions = new Actions(TestBase.getDriver());
		actions.moveToElement(checkbox).perform();
		JavascriptExecutor js = (JavascriptExecutor)TestBase.getDriver();
		js.executeScript("arguments[0].click();", checkbox);
			

	}

	public void appbtn() {
		startappBtn.click();
	}

}
