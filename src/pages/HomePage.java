package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import base.TestBase;

public class HomePage extends TestBase{
	
	WebDriver driver;
	public HomePage(WebDriver driver){
	this.driver=driver;
	}
	
	
	By allLink =By.xpath("//a[@id='nav-hamburger-menu']");
	public void clickOnAll(){
		fluentWaitForElement(allLink);
		driver.findElement(allLink).click();
	}
	
	
	By bestSeller =By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a");
	public void clickOnBestSeller(){
		fluentWaitForElement(bestSeller);
		driver.findElement(bestSeller).click();
	}
	
	By account_Lists =By.xpath("//span[normalize-space()='Account & Lists']");
	public void mouseHoverOnAccount_Lists(){
		fluentWaitForElement(account_Lists);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(account_Lists));
		act.build().perform();
	}
	
	
	By startHere =By.xpath("//a[@class='nav-a']");
	public void clickOnStartHere(){
		fluentWaitForElement(startHere);
		driver.findElement(startHere).click();
	}
	
	
	By searchBar =By.xpath("//input[@id='twotabsearchtextbox']");
	public void enterProductName(){
		fluentWaitForElement(searchBar);
		driver.findElement(searchBar).sendKeys("Laptop");
	}
	
	By searchButton =By.xpath("//*[@id=\"nav-search-submit-button\"]");
	public void clickOnSearchButton(){
		fluentWaitForElement(searchButton);
		driver.findElement(searchButton).click();
	}
	}