package com.ActiTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

	
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;

	
	//Address returning method
	public WebElement getUntb(){
		
		return untb;
	}
	//Action performing method
	public void setUntb(String un) {
		
		untb.sendKeys(un);
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public void setPwtb(String pwd) {
	 pwtb.sendKeys(pwd);
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void clickLoginBtn() {
		 loginBtn.click();
	}
	public void login(String un , String pwd) {
		
	untb.sendKeys(un);
	pwtb.sendKeys(pwd);
	loginBtn.click();
	}
}
