package com.et.pages;

import org.openqa.selenium.By;

import com.et.enums.WaitStrategy;

public final class DashboardPage extends BasePage{
	
	private final By linkUserMenu = By.cssSelector(".btn.btn-default.dropdown-toggle");
	
	private final By linkLogout = By.cssSelector(".fa.fa-sign-out.pull-right");
	
	public void clickonLoggedinUserDropdownlist()
	{
		click(linkUserMenu, WaitStrategy.CLICKABLE, "Super Admin button");
	}
	
	public LoginPage clickLogout()
	{
		
		click(linkLogout, WaitStrategy.CLICKABLE, "Logout Button");
		return new LoginPage();
	}
}
