package org.com;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass
{
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getPresbtn() {
		return presbtn;
	}

	@FindBys({
		
		@FindBy(name="username"),
		@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
	})

	private WebElement textuser;
	
	
	@FindBys({
		
		@FindBy(xpath="//input[@aria-label='Password']"),
		@FindBy(xpath="//input[@type='password']")
	})

	
	private WebElement txtpass;
	
	@FindBys({
		
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//div[text()='Log In']")
	})
	
	private WebElement presbtn;

}
