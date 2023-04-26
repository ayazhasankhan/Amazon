package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import base.TestBase;

public class RegisterPage extends TestBase{

	
	WebDriver driver;
	public RegisterPage(WebDriver driver){
	this.driver=driver;
	}
	

	By yourName = By.xpath("//input[@id='ap_customer_name']");
	public void enterYourName(){
		fluentWaitForElement(yourName);
		driver.findElement(yourName).sendKeys("Test Test");

	}
	
	By countryCode = By.xpath("//*[@id=\"auth-country-picker\"]");
	public void selectCountryCode(){
		fluentWaitForElement(countryCode);
		new Select(driver.findElement(countryCode)).selectByValue("CA");
		
	}
	
	By mobileNumber = By.xpath("//input[@id='ap_phone_number']");
	public void enterMobileNumber(){
		fluentWaitForElement(mobileNumber);
		driver.findElement(mobileNumber).sendKeys("7782013865");
		
	}

	
	public void enterAddress(){

	}
	
	public void enterPassword(){

	}
	
	By continueButton =By.xpath("//*[@id=\"continue\"]");
	public void clickOnContinueButton(){
		fluentWaitForElement(continueButton);
      driver.findElement(continueButton).click();
	}

}