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
public class NetworkBuilderHomePage extends BasePage{

	public NetworkBuilderHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	private By navigateToInventory = By.xpath("//div[contains(text(),'Inventory')]/..");
	private By networkBuilderHomePage_header = By.xpath("//td[contains(text(),'[Network Builder / DefaultNBProfile]')]");
	private By verify_InventoryPage = By.xpath("//td[contains(text(),'Inventory')]");
	//Discovery
	private By navigateToDiscovery = By.xpath("//div[contains(text(),'Discovery')]/..");
	private By verify_DiscoveryPage = By.xpath("//td[contains(text(),'Discovery')]");
	
	
}
