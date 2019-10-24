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
public class ConnectionCreationPage extends BasePage{

	public ConnectionCreationPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	private By connectionId_Box = By.name("ID");
	private By serviceDetails_Tab = By.xpath("//div[text()='Service Selection Details']");
	private By signalType_Dropdown = By.xpath("//input[@name='signalType']/../following-sibling::td//img");
	private By signalType_List = By.xpath("/html[1]/body[1]/div[13]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/nobr");
	
	private By profile_Dropdown = By.xpath("//input[@name='ProfileName']/../following-sibling::td//img");
	private By profile_List = By.xpath("/html[1]/body[1]/div[14]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/nobr");
	private By legDetails_Tab = By.xpath("//div[text()='Leg Details']");
	// Leg Deatils
	private By startTime_RadioButton = By.xpath("(//td[@class='normal'][contains(text(),'Date')]/../../../../../preceding-sibling::div[1]/div/div)[1]");
	private By endTime_RadioButton = By.xpath("(//td[@class='normal'][contains(text(),'Date')]/../../../../../preceding-sibling::div[1]/div/div)[2]");
	// Start Billing Time
	private By startBillingDate_Box = By.name("startDate_dateTextField");
	private By trunUpTime_Box = By.name("turnUp");
	private By endBillingDate_Box = By.name("endDate_dateTextField");
	private By goodNightTime_Box = By.name("goodNight");
	// Source Destination
	private By sourceSite_Dropdown = By.xpath("(//label[text()='Site']/../following-sibling::td/span)[1]");
	private By sourceEquipment_Dropdown = By.xpath("//input[@name='sourceEquipmentId']/../following-sibling::td");
	private By sourcePort_Dropdown = By.xpath("//input[@name='sourcePortId']/../following-sibling::td");
	
	private By destinationSite_Dropdown = By.xpath("(//label[text()='Site']/../following-sibling::td/span)[2]");
	private By destinationEquipment_Dropdown = By.xpath("//input[@name='terminatingEquipmentId']/../following-sibling::td");
	private By destinationPort_Dropdown = By.xpath("//input[@name='terminatingPortId']/../following-sibling::td");
	// Leg Protection
	private By protectionType_Box = By.xpath("//input[@name='protectiontype']/../following-sibling::td");
	private By addDestination_Button = By.xpath("//td[contains(text(),'Add Destination')]");
	private By create_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Create')]");
	private By findroute_Button = By.xpath("//td[contains(text(),'Find Route')]");
	
	
	
	
	
}
