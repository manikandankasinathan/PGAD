package com.PGAD.QA.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PGAD.QA.BaseClass.BasePage;

public class WaitLib extends BasePage{

	public WaitLib(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//1. These 2 variable we used in TestBase Class for Page Load and Implicit Wait.
		public static long Page_Load_TimeOut = 20;
		public static long Implicit_Wait = 30;
}
