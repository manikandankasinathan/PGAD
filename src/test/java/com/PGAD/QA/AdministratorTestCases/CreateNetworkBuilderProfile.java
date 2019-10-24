package com.PGAD.QA.AdministratorTestCases;

import org.testng.annotations.Test;

import com.PGAD.QA.AdministratorPages.AdministratorHomePage;
import com.PGAD.QA.AdministratorPages.SecurityPage;
import com.PGAD.QA.BaseClass.LoginPage;
import com.PGAD.QA.BaseTest.BaseTest;
import com.PGAD.QA.FileReader.ExcelFileReader;

public class CreateNetworkBuilderProfile extends BaseTest {
	
	ExcelFileReader testdata = ExcelFileReader.getXssfSheetUtil(exceldata);

	@Test
	public void test_createNetworkBuilderProfile() {
		base.getInstance(LoginPage.class).adminstrator_login(testdata.getdata("Login", 0, 0), testdata.getdata("Login", 0, 1));
		base.getInstance(AdministratorHomePage.class).security_Tab();
		base.getInstance(SecurityPage.class).creationNetworkBuilderProfile(testdata.getdata("profileData", 2, 0), testdata.getdata("profileData", 2, 1));
		base.getInstance(AdministratorHomePage.class).logOut();
	}
}
