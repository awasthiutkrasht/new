package com.ActiTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageElements {

	@FindBy(xpath="//div[@id='container_users']") private WebElement userTab;
	
	public WebElement getUsersTab() {
		return userTab;	
	}
	public void clickUsersTab() {
		
		userTab.click();
	}
}
