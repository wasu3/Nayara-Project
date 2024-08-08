package com.nayara.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPage {

	@FindBy(xpath="//span[text()='Users']/../../../a[6]")
	private WebElement usrbtn;

	@FindBy(xpath="//div[@class='pull-right']/button[1]")
	private WebElement addusrbtn;

	@FindBy(id="user-name")
	private WebElement untf;

	@FindBy(id="user-email")
	private WebElement emtf;

	@FindBy(id="first-name")
	private WebElement fntf;

	@FindBy(id="last-name")
	private WebElement lntf;

	@FindBy(id="contact-number")
	private WebElement cntf;

	@FindBy(id="Password")
	private WebElement pdtf;

	@FindBy(id="confirm-password")
	private WebElement cpdtf;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement rdd;
	
	@FindBy(xpath="(//div[.='ADMIN'])[1]")
	private WebElement adr;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement sdd;
	
	

	public userPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setAddUser() throws InterruptedException {
		Thread.sleep(5000);
		usrbtn.click();
		Thread.sleep(5000);
		addusrbtn.click();
		untf.sendKeys("wasu35");
		emtf.sendKeys("wasu@maildrop.cc");
		fntf.sendKeys("WASU");
		lntf.sendKeys("35");
		cntf.sendKeys("9876543210");
		pdtf.sendKeys("78635");
		cpdtf.sendKeys("78635");
		rdd.click();
		adr.click();
		sdd.click();
		
	}


}
