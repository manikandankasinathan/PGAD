/**
 * 
 */
package com.PGAD.QA.BaseTest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.PGAD.QA.BaseClass.BasePage;
import com.PGAD.QA.BaseClass.Page;
import com.PGAD.QA.FileReader.ConfigFileReader;
import com.PGAD.QA.FileReader.ExcelFileReader;
import com.PGAD.QA.FileReader.PathDirectory;
import com.PGAD.QA.Helper.WaitLib;

/**
 * @author Subhajit
 *
 */
public class BaseTest extends PathDirectory{

	public WebDriver driver;
	public WebDriverWait wait;
	public Page base;
	private static Properties prop;
	
	@BeforeClass
	public void setup(){
		//setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		prop = ConfigFileReader.getConfigPropObject();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WaitLib.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WaitLib.Implicit_Wait, TimeUnit.SECONDS);
		//Navigate to a URL
        driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		//Create the object of page class : Instantiate Page Class
		base = new BasePage(driver, wait);
		
	}
}
