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
public class MOCreationPage extends BasePage{

	public MOCreationPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	/**
	 * Locators for Inventory MO Creation
	 */		
	
	//Site
	private By site_Button = By.xpath("(//td[contains(text(),'Site')])[1]");	

	
	//Cable
	private By cable_Button = By.xpath("(//td[contains(text(),'Cable')])[1]");
	
	
	//Path 
	private By path_Button = By.xpath("(//td[contains(text(),'Path')])[1]");
	private By bandwidthType_DropDown = By.xpath("//input[contains(@name,'bandwidthtype')]/following::td[1]/span/img");
	
	//Common for all MO
	private By mo_Name = By.name("name");
	private By save_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Save')]");
	private By ok_Button = By.xpath("//div[text()='OK']");
	
	//Common for Path and Cable
	private By technologyType_DropDown = By.xpath("//div[contains(text(),'DTM')]");
	
	//Cable & Path Association
	private By site_DropDownBox = By.name("Site");
	private By ASide_Drop = By.xpath("//td[contains(text(),'A-SIDE')]");
	private By ZSide_Drop = By.xpath("//td[contains(text(),'Z-SIDE')]");
	private By connect_Button = By.xpath("//div[text()='Connect']");
	private By connectPathAssociation_Button = By.xpath("(//div[text()='Connect'])[2]");
	private By removeAssociation_Button = By.xpath("//td[@class='buttonTitleColor'][contains(text(),'Remove Association')]");
	
	
	
}
