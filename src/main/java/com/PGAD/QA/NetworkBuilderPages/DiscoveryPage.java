/**
 * 
 */
package com.PGAD.QA.NetworkBuilderPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;

/**
 * @author Subhajit
 *
 */
public class DiscoveryPage extends BasePage {

	public DiscoveryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	/**
	 * Locators for Discovery Module
	 */	
	
	private By ipAddress_Box = By.name("IPAddress");
	private By discovery_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Discover')]");
	private By loader_icon = By.xpath("//img[contains(@src,'/linkmanager/linkmanager/images/loading-icon.gif')]");
	private By discovery_PopUp = By.xpath("//td[contains(text(),'Discovery completed. No mismatch details found for')]");
	private By update_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Update')]");
	
	
	
}
