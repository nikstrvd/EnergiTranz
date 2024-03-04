package com.et.pages;

import org.openqa.selenium.By;

public class PromocodePage extends BasePage {
	
	public final By Promocodebtn = By.xpath("//span[normalize-space()='Promocodes']");
	public final By AddNewbtn = By.id("add");
	public final By Editbtn = By.xpath("tr[class='odd'] button[title='View']");
	public final By TitleTextbox = By.id("title");
	
	public final By Savebtn = By.id("save");
	public final By Closebtn = By.xpath("//button[normalize-space()='Close']");

}
