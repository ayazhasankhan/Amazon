package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;

public class SearchResultPage extends TestBase{

	WebDriver driver;
	public SearchResultPage(WebDriver driver){
	this.driver=driver;
	}
	
	By ASUSCheckBox = By.xpath("//li[@id='p_89/ASUS']//i[@class='a-icon a-icon-checkbox']");
	public void selectAsus(){
		fluentWaitForElement(ASUSCheckBox);
		driver.findElement(ASUSCheckBox).click();
	}
}
