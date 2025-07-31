package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginA {
	
	public WebDriver ldriver;
	
	@FindBy(xpath="//tagName[@id='123']")
	WebElement elementa;
	
	public LoginA(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void loginA() {
		System.out.println("login A");
	}

}
