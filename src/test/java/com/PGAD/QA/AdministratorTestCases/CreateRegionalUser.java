package com.PGAD.QA.AdministratorTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.PGAD.QA.AdministratorPages.AdministratorHomePage;
import com.PGAD.QA.AdministratorPages.SecurityPage;
import com.PGAD.QA.BaseClass.LoginPage;
import com.PGAD.QA.BaseTest.BaseTest;
import com.PGAD.QA.FileReader.ExcelFileReader;

public class CreateRegionalUser extends BaseTest {
	
	ExcelFileReader testdata = ExcelFileReader.getXssfSheetUtil(exceldata);
	
	
	@Test
	public void test_createRegionalUser() {
		base.getInstance(LoginPage.class).adminstrator_login(testdata.getdata("Login", 0, 0), testdata.getdata("Login", 0, 1));
		base.getInstance(AdministratorHomePage.class).security_Tab();
		base.getInstance(SecurityPage.class).usersCreation(testdata.getdata("userData", 1, 0),testdata.getdata("userData", 1, 1),testdata.getdata("userData", 1, 2),testdata.getdata("userData", 1, 3),testdata.getdata("userData", 1, 4));
		base.getInstance(AdministratorHomePage.class).logOut();
	}
	
	@Test
	public void test_loginRegionalUser() {
		
		base.getInstance(LoginPage.class).adminstrator_login(testdata.getdata("Login", 1, 0), testdata.getdata("Login", 1, 1));
		base.getInstance(AdministratorHomePage.class).logOut();
		
	}
	

}
