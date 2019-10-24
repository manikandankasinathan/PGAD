/**
 * 
 */
package com.PGAD.QA.Helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;

/**
 * @author Subhajit
 *
 */
	public class SeleniumLib extends BasePage {

	public SeleniumLib(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void dropDownList(By xpath,String value){
		
		List<WebElement> options = driver.findElements(xpath);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(xpath)));
		for(WebElement option : options) {
		    if (option.getText().equals(value)) {
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		        option.click();
		        break;
		    }
		}
		
	}
	
	public void keyboardAction(){
		Actions action = new Actions(driver);

	}
	
	}
