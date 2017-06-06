package com.stackroute;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User {

	static String BASE_URL = "http://localhost:8081/ActivityStream";
	static WebDriver driver = null;

	@Given("^Open web site$")
	public static void  Open_web_site () {
		if (driver == null) {
			File file = new File("lib/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());

			// System.setProperty("webdriver.chrome.driver",
			// file.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.get(BASE_URL);
		}
	}

	/*
	 * @Given("^I enter ActivityStrem url$") public void
	 * I_enter_ActivityStrem_url() { File file = new
	 * File("lib/chromedriver.exe");
	 * System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
	 * 
	 * // System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	 * driver = new FirefoxDriver(); driver.get(BASE_URL); }
	 * 
	 * @Then("^open login page$") public void open_login_page(){
	 * System.out.println("gotoLoginPage");
	 * 
	 * driver.navigate().to(BASE_URL); }
	 */

	// **************** Login validation ************************************//
	@When("^I entered username as <\"([^\"]*)\">$")
	public void i_entered_username_as(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@When("^password as <\"([^\"]*)\">$")
	public void password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^click on submit button$")
	public void click_on_submit_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("^open home page$")
	public void open_home_page() {
		driver.navigate().to("http://localhost:8081/ActivityStream/#/home");
	}

	@When("^I click login button$")
	public void i_click_login_button() {
		driver.findElement(By.id("toLogin")).click();
	}

	@Then("^open login page$")
	public void open_login_page() {
		driver.navigate().to("http://localhost:8081/ActivityStream/#/tologin");
	}

	// ********************************** Registration
	// *******************************************/
	@When("^I click register button$")
	public void i_click_register_button() {
		driver.findElement(By.id("toRegister")).click();
	}

	@Then("^open registration page$")
	public void open_registration_page() {
		driver.navigate().to("http://localhost:8081/ActivityStream/#/toregister");
	}

	@Given("^I am in registration page$")
	public void i_am_in_registration_page() {
		driver.navigate().to("http://localhost:8081/ActivityStream/#/toregister");
	}

	@When("^I entered id as <\"([^\"]*)\">$")
	public void i_entered_id_as(String id) {
		driver.findElement(By.id("id")).sendKeys(id);
	}

	@When("^I entered name as <\"([^\"]*)\">$")
	public void i_entered_name_as(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}

	@When("^I entered passwordsignup as <\"([^\"]*)\">$")
	public void i_entered_passwordsignup_as(String passwordsignup) {
		driver.findElement(By.id("passwordsignup")).sendKeys(passwordsignup);
	}

	@When("^I entered passwordsignup_confirm as <\"([^\"]*)\">$")
	public void i_entered_passwordsignup_confirm_as(String passwordsignup_confirm) {
		driver.findElement(By.id("passwordsignup_confirm")).sendKeys(passwordsignup_confirm);
	}

	@When("^click on Register button$")
	public void click_on_Register_button() {
		driver.findElement(By.id("Register")).click();
	}

}