/**
 * 
 */
package com.PGAD.QA.Helper;

import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;

/**
 * @author Subhajit
 *
 */
public class JSExecutorLib extends BasePage {

	public static JavascriptExecutor js;
	
	
	public JSExecutorLib(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	
	public static void clickElementByJS(WebElement element, WebDriver driver){
		js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void scrollIntoView(WebElement element, WebDriver driver){
		js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void extractJSLogsInfo(){
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		for(LogEntry entry : logEntries){
			System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
		}
	}
	
	
}
