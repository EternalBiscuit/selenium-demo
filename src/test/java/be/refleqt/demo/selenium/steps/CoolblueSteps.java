package be.refleqt.demo.selenium.steps;

import be.refleqt.demo.pages.HomePage;
import be.refleqt.demo.util.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoolblueSteps {
    private HomePage homePage;


    @Before
    public void beforeHook(Scenario scenario){
        DriverManager.initializeDriver();
    }

    @After
    public void afterHook(Scenario scenario){
        DriverManager.getDriver().quit();
    }


    @Given("I go to (.*)")
    public void openWebSite(String url){
        homePage = new HomePage();
        homePage.goToHomePage(url);
    }

    @When("I log in with username (.*) and password (.*)")
    public void loginWithUserName(String userName, String password){
        homePage.clickLoginButton()
                .fillInUserName(userName)
                .fillInPassword(password)
                .confirmLogin();
    }

    @Then("I am logged on")
    public void validateLogin(){
        homePage.validateWelkom();
    }
}
