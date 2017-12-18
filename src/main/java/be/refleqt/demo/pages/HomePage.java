package be.refleqt.demo.pages;

import be.refleqt.demo.util.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//a[@title='Inloggen']")
    WebElement loginButton;

    @FindBy(id = "header_menu_password")
    WebElement passwordField;

    @FindBy(id = "header_menu_emailaddress")
    WebElement usernameField;

    @FindBy(xpath = "//button[@data-trackclickevent='Header|Login|Login (button)']")
    WebElement confirmLoginButton;

    @FindBy(xpath = "//span[@class='coolbar-navigation--title coolbar-navigation--item-login-username']")
    WebElement welkomText;

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public HomePage goToHomePage(String url){
        DriverManager.getDriver().get(url);
        return this;
    }

    public HomePage clickLoginButton(){
        loginButton.click();
        return this;
    }

    public HomePage fillInUserName(String userName){
        usernameField.sendKeys(userName);
        return this;
    }

    public HomePage fillInPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public void confirmLogin(){
        confirmLoginButton.click();
    }

    public void validateWelkom() {
        Assert.assertEquals("Welko", welkomText.getText());
    }
}
