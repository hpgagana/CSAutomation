package com.cstech.testscript;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cstech.generic.FileUtility;
import com.cstech.pom.HomePage;
import com.cstech.pom.LoginPage;


public class TestFileUpload extends com.cstech.generic.BaseClass{
	@Test
	public void testFileUpload() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		FileUtility fileUtils = new FileUtility();
		String username = fileUtils.readDataFromPropertyFile("username");
		String password = fileUtils.readDataFromPropertyFile("password");
		loginPage.getUnTbx().sendKeys(username);
		loginPage.getPwTbx().sendKeys(password);
		loginPage.getLoginBtn().click();
		HomePage homePage = new HomePage(driver);
		homePage.getdropdownMenuBtn().click();
		homePage.getOrderBtn().click();
		homePage.getBulkOrdersBtn().click();
		WebElement fileUpload = homePage.getChooseFileBtn();
		String relativePath = fileUtils.readDataFromPropertyFile("path");
		File f = new File(relativePath);
		String path = f.getAbsolutePath();
		fileUpload.sendKeys(path);
		homePage.getImportBtn().click();
		WebElement table = homePage.getWebtable();
		File src = table.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./screenshot/table " + timeStamp + ".png");
		FileUtils.copyFile(src, destFile);
	}
}
