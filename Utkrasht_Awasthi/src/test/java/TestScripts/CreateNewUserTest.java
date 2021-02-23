package TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActiTime.GenericLib.BaseClass;
import com.ActiTime.objectRepository.HomePageElements;
import com.ActiTime.objectRepository.LoginPage;
import com.ActiTime.objectRepository.UserListPage;


@Listeners(com.ActiTime.GenericLib.ListenerFunctionality.class)
public class CreateNewUserTest extends BaseClass{

	
	@Test
	public void createNewUser() throws Throwable {
		
	
	HomePageElements ent = PageFactory.initElements(driver, HomePageElements.class);
	UserListPage ur = PageFactory.initElements(driver, UserListPage.class);
	ent.getUsersTab();
	ent.clickUsersTab();
	ur.getnewuserBtn().click();
	ur.getFirstNameTB().sendKeys(data.getDataFromExcel("Sheet1", 0, 1));
	ur.getMiddleNameTB().sendKeys(data.getDataFromExcel("Sheet1", 1, 1));
	ur.getLastNameTB().sendKeys(data.getDataFromExcel("Sheet1", 2, 1));
	ur.getEmailTB().sendKeys(data.getDataFromExcel("Sheet1", 3, 1));
	ur.getsaveBtn().click();
	
        
	}
}
