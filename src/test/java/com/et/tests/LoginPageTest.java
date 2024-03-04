package com.et.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.et.pages.DashboardPage;
import com.et.pages.LoginPage;

public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest()
	{
		
	}
	
	@Test
	public void LoginLogoutTest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
	}
	
	@Test
	public void LoginLogoutTest1(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
	}
	
	@Test
	public void LoginLogoutTest2(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
	}
	
	@Test
	public void LoginLogoutTest3(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
	}
	
	@Test
	public void LoginLogoutTest4(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
	}
	
	@Test
	public void LoginLogoutTest5(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		String title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit().getPageTitle();
		Assertions.assertThat(title).isEqualTo("Dashboard - Mustafa Application");
	}
	
	
	@Test
	public void ForgetPasswordTest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		String title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit().getPageTitle();
		Assertions.assertThat(title).isEqualTo("Dashboard - Mustafa Application");
	}
	
	@Test
	public void LoginLogoutTest6(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		String title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit().getPageTitle();
		Assertions.assertThat(title).isEqualTo("Dashboard - Mustafa Application");
		dp.clickonLoggedinUserDropdownlist();
		dp.clickLogout();
	}

	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object [][] getData()
	{	
		return new Object[][]
		{
			{"nikhil@2stallions.com", ""},
			{"nikhil@2stallions.com", "      "},
			{"nikhil@2stallions.com", "12345632"},
			{"", "123456"},
			{"      ", "123456"},
			{"test@test.com", "123456"},
			{"nikhil@2stallions.com", "2St@llions"}
		};

}
}
