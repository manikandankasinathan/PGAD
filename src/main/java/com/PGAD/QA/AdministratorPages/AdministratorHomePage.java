/**
 * 
 */
package com.PGAD.QA.AdministratorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;
import com.PGAD.QA.BaseClass.LoginPage;

/**
 * @author Subhajit
 *
 */
public class AdministratorHomePage extends BasePage {

	public AdministratorHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//Locators for Administrator Module
	
	private By security_Tab = By.xpath("//div[text()='Security']");
	private By users_Tab = By.xpath("//td[@class='treeCell'][contains(text(),'Users')]");
	
	private By administratorHomePage_header = By.xpath("//td[contains(text(),'Welcome admin(Super Admin) [Administrator ')]");
	private By logout = By.xpath("//img[contains(@src,'/images/logout.png\')]");

	
	// Actions 
	
	public SecurityPage security_Tab() {
		doClick(security_Tab);
		return getInstance(SecurityPage.class);
	}
	
	public LoginPage logOut() {
		doClick(logout);
		return getInstance(LoginPage.class);
	}
}
