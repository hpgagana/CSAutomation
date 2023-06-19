package com.cstech.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//span[text()='chevron_right']")
	private WebElement dropdownMenuBtn; 
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orderBtn;
	@FindBy(xpath="//button[text()='Add Bulk Orders']")
	private WebElement bulkOrdersBtn;
	@FindBy(xpath="//input[@type='file']")
	private WebElement chooseFileBtn;
	@FindBy(xpath="//button[text()='Import']")
	private WebElement importBtn;
	@FindBy(xpath="//table[@class='MuiTable-root css-9177x2']")
	private WebElement webtable;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getdropdownMenuBtn() {
		return dropdownMenuBtn;
	}
	public WebElement getOrderBtn() {
		return orderBtn;
	}
	public WebElement getBulkOrdersBtn() {
		return bulkOrdersBtn;
	}
	public WebElement getChooseFileBtn() {
		return chooseFileBtn;
	}
	public WebElement getImportBtn() {
		return importBtn;
	}
	public WebElement getWebtable() {
		return webtable;
	}
}
