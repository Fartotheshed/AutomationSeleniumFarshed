package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;

public class Login implements BaseLogin{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfig("URL"));
		MasterPageFactory obj = new MasterPageFactory(driver);
		Highlighter.addColor(driver, obj.getSignin());
		obj.getSignin().click();
		Highlighter.addColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfig("user"));
		Highlighter.addColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getConfig("password"));
		Highlighter.addColor(driver, obj.getLoginbtn());
		obj.getLoginbtn().click();
	}
	
}
