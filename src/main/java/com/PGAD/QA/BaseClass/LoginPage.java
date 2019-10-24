/**
 * 
 */
package com.PGAD.QA.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.AdministratorPages.AdministratorHomePage;
import com.PGAD.QA.ProvisionerPages.ProvisionerHomePage;

/**
 * @author Subhajit
 *
 */
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	 private By username = By.name("username");
	 private By password = By.name("Password");
	 private By role_Adminstrator = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Administrator'])[1]/following::img[1]");
	 private By role_NetworkBuilder = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Network Builder'])[1]/following::img[1]");
	 private By role_Provisioner = By.xpath("//nobr[contains(text(),'Provisioner')]");
	 private By role_Dropdown = By.xpath("//div[text()='Administrator']/../following-sibling::td/span");
	 private By login_Button = By.xpath("//div[text()='Login']");
	 private By build_id = By.xpath("//td[contains(text(),'LMO-3.1.1')]");
	 private By error_Label = By.xpath("//*[@class='error-label']");
	 


	public AdministratorHomePage adminstrator_login(String UserName, String Password){
		doSendKeys(username, UserName);
		doSendKeys(password, Password);
		doClick(login_Button);
		return getInstance(AdministratorHomePage.class);
	}
	
	public ProvisionerHomePage provisioner_login(String UserName, String Password){
		doSendKeys(username, UserName);
		doSendKeys(password, Password);
		doClick(role_Dropdown);
		doClick(role_Provisioner);
		doClick(login_Button);
		return getInstance(ProvisionerHomePage.class);
	}

}
