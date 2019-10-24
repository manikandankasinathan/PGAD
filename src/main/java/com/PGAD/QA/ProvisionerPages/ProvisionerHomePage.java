/**
 * 
 */
package com.PGAD.QA.ProvisionerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;

/**
 * @author Subhajit
 *
 */
public class ProvisionerHomePage extends BasePage {

	public ProvisionerHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	private By navigateToDashboard = By.xpath("//div[contains(text(),'Dashboard')]/..");
	private By dashboardHomePage_header = By.xpath("//td[contains(text(),'Welcome admin(Super Admin) [Provisioner '");

	public ConnectionViewPage navigateToDashboard(){
		doClick(navigateToDashboard);
		return  getInstance(ConnectionViewPage.class);
	}
	
	
	
	
	
	
}
