package com.qa.automationpractice.step_def;

import com.qa.automationpractice.driver.DriverManager;
import com.qa.automationpractice.page_elements.AuthenticationPage;
import com.qa.automationpractice.page_elements.HomePage;
import com.qa.automationpractice.page_elements.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends DriverManager {
    HomePage homePage = new HomePage();
    AuthenticationPage authenpage = new AuthenticationPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        String title = homePage.getTitle();
        System.out.println(title);

    }

    @When("^I click on Sign in link$")
    public void i_click_on_Sign_in_link()  {
        homePage.siginIn();
    }

    @Then("^AUTHENTICATION page should be loaded$")
    public void authentication_page_should_be_loaded()  {
        authenpage.getTitle();
    }

    @Then("^I enter valid credentials$")
    public void i_enter_valid_credentials() {
        authenpage.loginCredentials();
    }

    @Then("^I can login successfully$")
    public void i_can_login_successfully()  {
        myAccountPage.getTitle();
        myAccountPage.loginSuccessfully();

    }



}
