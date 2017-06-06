package com.stackroute;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class User {
	
	String BASE_URL="http://localhost:8081/ActivityStream";
	WebDriver driver;
	
	@Given("^I enter ActivityStrem url$")
	public void I_enter_ActivityStrem_url() {
		File file = new File("lib/chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
       // System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.get(BASE_URL);
	}

	@Then("^open login page$")
	public void open_login_page(){
		System.out.println("gotoLoginPage");
		
		driver.navigate().to(BASE_URL);
	}
	
	


	
}