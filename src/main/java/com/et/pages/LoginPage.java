package com.et.pages;

import org.openqa.selenium.By;

import com.et.enums.WaitStrategy;

public final class LoginPage extends BasePage{
	
	public final By textbox_username = By.name("uname");
	public final By textbox_password = By.name("pwd");
	public final By btn_login = By.cssSelector(".btn.btn-lg.btn-success.btn-block");
	private final By textbox_otp = By.name("otp_code");
	private final By button_submit = By.cssSelector(".btn.btn-lg.btn-success.btn-block");
	private final By forgetpassword = By.xpath("(//a[normalize-space()='Forgot Password?']");
	public final By textbox_email = By.name("email");

	
	public LoginPage enterUsername(String username)
	{
		
		sendKeys(textbox_username, username, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		sendKeys(textbox_password, password, WaitStrategy.PRESENSE, "Password Field");
		return this;
	}
	
	public LoginPage ClickLogin()
	{
		click(btn_login, WaitStrategy.CLICKABLE, "Login button from Login page");
		return this;
	}
	
	public LoginPage enterOTP(String otp)
	{
		
		sendKeys(textbox_otp, otp, WaitStrategy.PRESENSE, "OTP Field");
		return this;
	}
	
	public DashboardPage ClickSubmit()
	{
		click(button_submit, WaitStrategy.CLICKABLE, "Submit button from Login page");
		return new DashboardPage();
	}
	
	public void ForgetPassword()
	{
		click(forgetpassword, WaitStrategy.CLICKABLE, "Click on ForgetPassword Link");
	}
	
	public void EnterForgetPasswordEmail(String email)
	{
		sendKeys(textbox_email, email, WaitStrategy.PRESENSE, "Username Field");
	}
	
	
	public String getTitle()
	{
		return getPageTitle();
	}
	
	
}
