package com.nayara.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement untbx;
	@FindBy(id="password")
	private WebElement pwtbx;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement lgbtn;
	@FindBy(xpath="//span[text()='Nayara']")
	private WebElement cus_choice ;
	@FindBy(xpath="//button[text()=' OK ']")
	private WebElement okbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un,String pd) throws InterruptedException {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pd);
		lgbtn.click();
		cus_choice.click();
		Thread.sleep(3000);
		okbtn.click();	
	}





}
