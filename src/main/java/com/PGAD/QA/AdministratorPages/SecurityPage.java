/**
 * 
 */
package com.PGAD.QA.AdministratorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;
import com.PGAD.QA.Helper.SeleniumLib;

/**
 * @author Subhajit
 *
 */
public class SecurityPage extends BasePage {

	public SecurityPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	/**
	 * Locators for Security Module
	 */
	// Profile
	private By securityPage_Header = By.xpath("//td[contains(text(),'Security')]");
	private By profile_Tab = By.xpath("//td[@class='treeCell'][contains(text(),'Profiles')]");
	private By profilePage_Header = By.xpath("//td[contains(text(),'Security [Profiles]')]");
	private By addProfile_Button = By.xpath("//*[contains(text(),'Add Profile')]");
	private By profileName_Box = By.name("ProfileName");
	private By profileDescription_Box = By.name("ProfileDescription");
	private By role_DropDown = By.xpath("//label[text()='Associated Role']/following::td[1]/table/tbody/tr/td[1]/table");
	private By associatedAdminRole_List = By.xpath("//*[contains(@id,'isc_PickListMenu_0_row')]//*[contains(text(),'Administrator')]");
	private By associatedNetworkRole_List = By.xpath("//*[contains(@id,'isc_PickListMenu_0_row')]//*[contains(text(),'Network Builder')]");
	private By associatedProvisionerRole_List = By.xpath("//*[contains(@id,'isc_PickListMenu_0_row')]//*[contains(text(),'Provisioner')]");
	private By select_Owner = By.xpath("//label[text()='Owner']/following::td[1]/table/tbody/tr/td[1]/table");
	
	// Administrator modules Checkbox web elements
	private By security_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Security')]/../..//td/nobr/span[2]");
	private By bandwidth_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Bandwidth')]/../..//td/nobr/span[2]");
	private By systemConfig_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'System Configuration')]/../..//td/nobr/span[2]");
	private By audio_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Audio')]/../..//td/nobr/span[2]");
	private By systemNoti_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'System Notifications')]/../..//td/nobr/span[2]");

	// Network builder modules checkbox web elements
	
	private By inventory_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Inventory')]/../..//td/nobr/span[2]");
	private By discovery_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Discovery')]/../..//td/nobr/span[2]");
	private By audit_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Audit')]/../..//td/nobr/span[2]");
	private By graphicalSite_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Graphical Site Hierarchy')]/../..//td/nobr/span[2]");
	private By system_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'System Notifications')]/../..//td/nobr/span[2]");
	private By assurance_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Assurance')]/../..//td/nobr/span[2]");
	private By scheduleDevice_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Schedule Device Maintenance')]/../..//td/nobr/span[2]");
	
	private By search_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Search')]/../..//td/nobr/span[2]");
	private By reports_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Reports')]/../..//td/nobr/span[2]");
	private By dashboard_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Dashboard')]/../..//td/nobr/span[2]");
	private By easyConnector_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'EasyConnector')]/../..//td/nobr/span[2]");
	private By deviceProfile_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'DeviceProfile')]/../..//td/nobr/span[2]");
	
	// Set MO rights Web elemnts
	private By customer_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Customer')]/../..//td/nobr/span[2]");
	private By site_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Site')]/../..//td/nobr/span[2]");
	private By cable_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Cable')]/../..//td/nobr/span[2]");
	private By path_CheckBox = By.xpath("//td[@class='treeCell'][contains(text(),'Path')]/../..//td/nobr/span[2]");
	
	private By save_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Save')]");
	private By rAdmin_List = By.xpath("//div[@class='gridBody']//nobr[contains(text(),'RA1')]");
	private By ra_checkbox = By.xpath("//div[@class='labelAnchor']//span[1]");

	// User
	private By user_Tab = By.xpath("//td[@class='treeCell'][contains(text(),'Users')]");
	private By userName_Box = By.name("UserName");
	private By firstName_Box = By.name("FirstName");
	private By lastName_Box = By.name("LastName");
	private By password_Box = By.name("Password");
	private By confirmPassword_Box = By.name("confirmPassword");
	private By userType_DropDown = By.xpath("//label[text()='User Type']/following::td[1]/table/tbody/tr/td[1]/table");
	private By add_Button = By.xpath("//td[contains(text(),'Add')]");
	private By addUser_Button = By.xpath("//*[contains(text(),'Add User')]");
	private By InActivityDuration_Box = By.name("InActivityDuration_timeTextField");
	private By type_Admin_Super_List = By.xpath("//*[text()='Super Admin']");
	private By type_Admin_Regional_List = By.xpath("//*[text()='Regional Admin']");
	private By user_successfullyMsg = By.xpath("//*[@class='windowBackground']//*[text()='Users added successfully']");
	private By ok_Button = By.xpath("//*[text()='OK']");
	private By user_ExistsMsg = By.xpath("//*[@class='windowBackground']//*[text()='user already exists']");

	// Actions

	public AdministratorHomePage usersCreation(String username, String Fname, String password, String Lname, String confirmpassword) {
		addUser_tab();
		doSendKeys(userName_Box, username);
		doSendKeys(firstName_Box, Fname);
		doSendKeys(password_Box, password);
		doSendKeys(lastName_Box, Lname);
		doSendKeys(confirmPassword_Box, confirmpassword);
		doClick(userType_DropDown);
		doClick(type_Admin_Regional_List);
		doClick(add_Button);
		doClick(save_Button);
		doClick(ok_Button);
		return getInstance(AdministratorHomePage.class);
	}

	public AdministratorHomePage creationAdministratorProfile(String profileName, String profileDesc) {
		addprofile_tab();
		doSendKeys(profileName_Box, profileName);
		doSendKeys(profileDescription_Box, profileDesc);
		doClick(role_DropDown);
		doClick(associatedAdminRole_List);
//		doClick(rAdmin_List);
//		doClick(ra_checkbox);
		selectAdminModules();
		setMORights();
		doClick(save_Button);
		doClick(ok_Button);
		return getInstance(AdministratorHomePage.class);
	}

	public AdministratorHomePage createProvisionerProfile(String profileName, String profileDesc) {
		addprofile_tab();
		doSendKeys(profileName_Box, profileName);
		doSendKeys(profileDescription_Box, profileDesc);
		doClick(role_DropDown);
		doClick(associatedProvisionerRole_List);
//		doClick(rAdmin_List);
//		doClick(ra_checkbox);
		setMORights();
		selectProvisionerModules();
		doClick(save_Button);
		doClick(ok_Button);
		return getInstance(AdministratorHomePage.class);
	}

	public AdministratorHomePage creationNetworkBuilderProfile(String profileName, String profileDesc) {
		addprofile_tab();
		doSendKeys(profileName_Box, profileName);
		doSendKeys(profileDescription_Box, profileDesc);
		doClick(role_DropDown);
		doClick(associatedNetworkRole_List);
//		doClick(rAdmin_List);
//		doClick(ra_checkbox);
		selectNetworkBuilderModules();
		setMORights();
		doClick(save_Button);
		doClick(ok_Button);
		return getInstance(AdministratorHomePage.class);
	}
	private void selectAdminModules() {
		doClick(security_CheckBox);
		doClick(systemConfig_CheckBox);
		doClick(audio_CheckBox);
		doClick(bandwidth_CheckBox);
		doClick(systemNoti_CheckBox);
	}

	private void setMORights() {
		doClick(customer_CheckBox);
		doClick(site_CheckBox);
		doClick(cable_CheckBox);
		doClick(path_CheckBox);
	}
	
	private void addprofile_tab() {
		doClick(profile_Tab);
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath("//td[@class='treeCell'][contains(text(),'Profiles')]"));
		action.contextClick(searchBox).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		doClick(addProfile_Button);
	}
	
	private void addUser_tab() {
		doClick(user_Tab);
		Actions action = new Actions(driver);
		WebElement searchBox = driver.findElement(By.xpath("//td[@class='treeCell'][contains(text(),'Users')]"));
		action.contextClick(searchBox).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		doClick(addUser_Button);
	}
	
	private void selectNetworkBuilderModules() {
		doClick(inventory_CheckBox);
		doClick(discovery_CheckBox);
		doClick(audit_CheckBox);
		doClick(graphicalSite_CheckBox);
		doClick(assurance_CheckBox);
		doClick(scheduleDevice_CheckBox);
		doClick(system_CheckBox);
	}
	
	private void selectProvisionerModules() {
		doClick(search_CheckBox);
		doClick(assurance_CheckBox);
		doClick(reports_CheckBox);
		doClick(dashboard_CheckBox);
		doClick(easyConnector_CheckBox);
		doClick(systemNoti_CheckBox);
		doClick(audio_CheckBox);
		doClick(deviceProfile_CheckBox);
		doClick(graphicalSite_CheckBox);
	}
}
