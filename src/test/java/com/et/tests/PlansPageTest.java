package com.et.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.et.pages.BasePage;
import com.et.pages.LoginPage;
import com.et.pages.PlansPage;

public class PlansPageTest extends BaseTest {
	
	private PlansPageTest() {}
	
	BasePage bp = new BasePage();
	
	@Test
	public void PlansMenuTest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		PlansPage pp = new PlansPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
		pp.ClickPlans();
	}
	
	@Test
	public void AddPlansTest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		PlansPage pp = new PlansPage();
		lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin().enterOTP(data.get("otp")).ClickSubmit();
		pp.ClickPlans();
		pp.ClickAddNewButton();
		pp.enterTitle(data.get("title")).enterDescription("description").enterMinimum("minimum").enterMaxmimum("maximum").enterEffectiveDateTextbox("effectivedate").enterNumberofYear("numberofyear").enterAmountTextbox("amount");
		bp.scroll();
		pp.OnboardingCheckbox();
		pp.CustomizationsCheckbox();
		pp.AiToolsCheckbox();
		pp.CarbonfootprintreportCheckbox();
		pp.CustomerservicesupportCheckbox();
		pp.SubmitButton();
	}

}
