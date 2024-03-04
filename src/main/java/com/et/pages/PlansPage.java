package com.et.pages;

import org.openqa.selenium.By;

import com.et.enums.WaitStrategy;

public class PlansPage extends BasePage {
	
	public final By Plansbtn = By.xpath("//span[normalize-space()='Plans']");
	public final By AddNewbtn = By.id("add");
	public final By Editbtn = By.xpath("tr[class='odd'] button[title='View']");
	public final By TitleTextbox = By.id("title");
	public final By DescriptionTextbox = By.id("description");
	public final By MinimumTextbox = By.id("min_users");
	public final By MaxmimumTextbox = By.id("max_users");
	public final By NumberofYearTextbox = By.id("number_of_year");
	public final By EffectiveDateTextbox = By.id("effective_date");
	public final By AmountTextbox = By.id("amount");
	public final By OnboardingCheckbox = By.id("onboarding_support");
	public final By CustomizationsCheckbox = By.id("customizations");
	public final By AiToolsCheckbox = By.id("aI_tool");
	public final By CarbonfootprintreportCheckbox = By.id("carbon_footprint_report");
	public final By CustomerservicesupportCheckbox = By.id("customer_service_support");
	public final By Savebtn = By.id("save");
	public final By Closebtn = By.xpath("//button[normalize-space()='Close']");
	
	public PlansPage OnboardingCheckbox()
	{
		click(OnboardingCheckbox, WaitStrategy.CLICKABLE, "OnboardingCheckbox button from Plans page");
		return this;
	}
	
	public PlansPage CustomizationsCheckbox()
	{
		click(CustomizationsCheckbox, WaitStrategy.CLICKABLE, "CustomizationsCheckbox button from Plans page");
		return this;
	}
	
	public PlansPage AiToolsCheckbox()
	{
		click(AiToolsCheckbox, WaitStrategy.CLICKABLE, "AiToolsCheckbox button from Plans page");
		return this;
	}
	
	public PlansPage CarbonfootprintreportCheckbox()
	{
		click(CarbonfootprintreportCheckbox, WaitStrategy.CLICKABLE, "CarbonfootprintreportCheckbox button from Plans page");
		return this;
	}
	
	public PlansPage CustomerservicesupportCheckbox()
	{
		click(CustomerservicesupportCheckbox, WaitStrategy.CLICKABLE, "CustomerservicesupportCheckbox button from Plans page");
		return this;
	}
	
	public PlansPage ClickPlans()
	{
		click(Plansbtn, WaitStrategy.CLICKABLE, "Plans button from Dashboard page");
		return this;
	}
	
	public PlansPage ClickAddNewButton()
	{
		click(AddNewbtn, WaitStrategy.CLICKABLE, "Add Newllans button from Plans page");
		return this;
	}
	
	public PlansPage EditPlansButton()
	{
		click(Editbtn, WaitStrategy.CLICKABLE, "Edit Plans button from Plans page");
		return this;
	}
	
	
	public PlansPage SubmitButton()
	{
		click(Savebtn, WaitStrategy.CLICKABLE, "Save button from Plans page");
		return this;
	}
	
	public PlansPage CloseButton()
	{
		click(Closebtn, WaitStrategy.CLICKABLE, "Close button from Plans page");
		return this;
	}
	
	public PlansPage enterTitle(String title)
	{
		
		sendKeys(TitleTextbox, title, WaitStrategy.PRESENSE, "title Field");
		return this;
	}
	
	public PlansPage enterDescription(String description)
	{
		
		sendKeys(DescriptionTextbox, description, WaitStrategy.PRESENSE, "Description Field");
		return this;
	}
	
	public PlansPage enterMinimum(String minimum)
	{
		
		sendKeys(MinimumTextbox, minimum, WaitStrategy.PRESENSE, "MinimumTextbox Field");
		return this;
	}
	
	public PlansPage enterMaxmimum(String maxmimum)
	{
		
		sendKeys(MaxmimumTextbox, maxmimum, WaitStrategy.PRESENSE, "MaxmimumTextbox Field");
		return this;
	}
	
	public PlansPage enterNumberofYear(String numberofyear)
	{
		
		sendKeys(NumberofYearTextbox, numberofyear, WaitStrategy.PRESENSE, "NumberofYearTextbox Field");
		return this;
	}
	
	public PlansPage enterEffectiveDateTextbox(String effectivedate)
	{
		
		sendKeys(EffectiveDateTextbox, effectivedate, WaitStrategy.PRESENSE, "EffectiveDateTextbox Field");
		return this;
	}
	
	public PlansPage enterAmountTextbox(String amount)
	{
		
		sendKeys(AmountTextbox, amount, WaitStrategy.PRESENSE, "AmountTextbox Field");
		return this;
	}

}
