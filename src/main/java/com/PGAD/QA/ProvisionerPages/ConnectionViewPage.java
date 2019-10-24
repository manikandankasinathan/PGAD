/**
 * 
 */
package com.PGAD.QA.ProvisionerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;
import com.PGAD.QA.Helper.SeleniumLib;

/**
 * @author Subhajit
 *
 */
public class ConnectionViewPage extends BasePage{

	public ConnectionViewPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	private By validateDashboard = By.xpath("//td[contains(text(),'Dashboard [ConnectionDashboard]')]");
	private By add_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Add')]");
	private By modify_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Modify')]");
	private By delete_Button = By.xpath("(//td[@class='buttonTitleColor'][contains(text(),'Delete')])[1]");
	private By dissconnect_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Disconnect')]");
	private By reconnect_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Reconnect')]");
	private By alarms_Button = By.xpath("//img[contains(@src,'linkmanager/images/alarms.png')]/..");
	private By connectionVarifyReport_Button = By.xpath("//img[contains(@src,'linkmanager/images/verify.png')]/..");
	private By decoderStats_Button = By.xpath("//img[contains(@src,'linkmanager/images/decoderstats.png')]/..");
	private By pav_Button = By.xpath("//img[contains(@src,'linkmanager/images/pav.png')]/..");
	private By spof_Button = By.xpath("//img[contains(@src,'linkmanager/images/spofDetection.png')]/..");
	private By serviceLock_Button = By.xpath("//img[contains(@src,'linkmanager/images/servicelock.png')]/..");
	private By serviceUnLock_Button = By.xpath("//img[contains(@src,'linkmanager/images/serviceunlock.png')]/..");
	private By navigateToLegView = By.xpath("//td[contains(text(),'Leg View')]");
	private By navigateToBookmark = By.xpath("//td[contains(text(),'Bookmark')]");
	private By navigateToDeletedServices = By.xpath("//td[contains(text(),'Deleted')]");
	private By connectionList = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr/td[2]/div/nobr");

	
	
	public void connection_Selection(String value){
		getInstance(SeleniumLib.class).dropDownList(connectionList, value);
		doClick(modify_Button);
	}
}
