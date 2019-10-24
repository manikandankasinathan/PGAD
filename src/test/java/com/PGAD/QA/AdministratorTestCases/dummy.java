package com.PGAD.QA.AdministratorTestCases;

import org.testng.annotations.Test;

import com.PGAD.QA.AdministratorPages.AdministratorHomePage;
import com.PGAD.QA.AdministratorPages.SecurityPage;
import com.PGAD.QA.BaseClass.LoginPage;
import com.PGAD.QA.BaseTest.BaseTest;
import com.PGAD.QA.FileReader.ExcelFileReader;
import com.PGAD.QA.Helper.SeleniumLib;
import com.PGAD.QA.ProvisionerPages.ConnectionViewPage;
import com.PGAD.QA.ProvisionerPages.ProvisionerHomePage;

public class dummy extends BaseTest{

	ExcelFileReader testdata = ExcelFileReader.getXssfSheetUtil(exceldata);
	
	@Test
	public void test() throws Exception{
		base.getInstance(LoginPage.class).provisioner_login(testdata.getdata("Login", 0, 0), testdata.getdata("Login", 0, 1));
//		base.getInstance(AdministratorHomePage.class).security_Tab();
//		base.getInstance(SecurityPage.class).profileCreation();
		base.getInstance(ProvisionerHomePage.class).navigateToDashboard();
		base.getInstance(ConnectionViewPage.class).connection_Selection("Connection12496");
	}
}
