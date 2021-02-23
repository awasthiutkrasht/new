package com.ActiTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class UserListPage {

	@FindBy(xpath="//div[text()='New User']") private WebElement newusersBtn;
    @FindBy(id="createUserPanel_firstNameField") private WebElement firstNameTB;
    @FindBy(id="createUserPanel_middleNameField") private WebElement middleNameTB;
    @FindBy(id="createUserPanel_lastNameField") private WebElement lastNameTB;
    @FindBy(id="createUserPanel_emailField") private WebElement emailTB;
    @FindBy(xpath="//div[text()='Save & Send Invitation']") private WebElement saveBtn;
  
    public WebElement getnewuserBtn() {
		return newusersBtn;
    	 }
    public WebElement getsaveBtn() {
		return saveBtn;	
    }
    
    public void clicknewuserBtn() {
    	
    	newusersBtn.click();
    }
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}
	public WebElement getMiddleNameTB() {
		return middleNameTB;
	}
	public WebElement getLastNameTB() {
		return lastNameTB;
	}
	public WebElement getEmailTB() {
		return emailTB;
	}
  
	
}
