package com.practiceautomation.stepdefinition;

import com.practiceautomation.pages.AndroidCategoryPage;
import com.practiceautomation.pages.BillingDetailsPage;
import com.practiceautomation.pages.DeleteItemPage;
import com.practiceautomation.pages.FilterAddToBasketPage;
import com.practiceautomation.pages.FilterFunctionalityPage;
import com.practiceautomation.pages.HtmlCategoryPage;
import com.practiceautomation.pages.IncreaseQuantityPage;
import com.practiceautomation.pages.InvalidLoginPage;
import com.practiceautomation.pages.JavaScriptPage;
import com.practiceautomation.pages.LoginPage;
import com.practiceautomation.pages.PlaceOrderPage;
import com.practiceautomation.pages.RegisterPage;
import com.practiceautomation.pages.SeleniumCategoryPage;
import com.practiceautomation.pages.SortingHighToLowPage;
import com.practiceautomation.pages.SortingLowToHighPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterationStepDefinition {
	LoginPage login = new LoginPage();
//	Launch_Chrome l=new Launch_Chrome();
	RegisterPage reg = new RegisterPage();
	InvalidLoginPage invalid = new InvalidLoginPage();
	AndroidCategoryPage androidbook = new AndroidCategoryPage();
	BillingDetailsPage billing = new BillingDetailsPage();
	DeleteItemPage remove = new DeleteItemPage();
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	HtmlCategoryPage html = new HtmlCategoryPage();
	IncreaseQuantityPage quantity = new IncreaseQuantityPage();
	JavaScriptPage js = new JavaScriptPage();
	PlaceOrderPage placeorder = new PlaceOrderPage();
	SeleniumCategoryPage selenium = new SeleniumCategoryPage();
	SortingHighToLowPage hightolow = new SortingHighToLowPage();
	SortingLowToHighPage lowtohigh = new SortingLowToHighPage();
	
	@Given("^Launch the chrome browser in system$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^open the Practice automation website$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Enter the Email and password$")
	public void enter_the_Email_and_password() throws InterruptedException 
	{
	    reg.register();
	}

	@Then("^Click the Register button$")
	public void click_the_Register_button() throws InterruptedException
	{
	    reg.clickRegisterButton();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}

}
