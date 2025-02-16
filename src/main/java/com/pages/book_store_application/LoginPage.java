package com.pages.book_store_application;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class LoginPage extends BookStoreApplicationPage {

    private By userNameField = By.id("userName");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By loginResult = By.id("name");

    public void setName(String name) {
        scrollToElementJS(userNameField);
        sendKeys(find(userNameField), Keys.chord(name));
    }

    public void setPassword(String password) {
        scrollToElementJS(passwordField);
        sendKeys(find(passwordField), Keys.chord(password));
    }

    public void clickLoginButton() {
        scrollToElementJS(loginButton);
        click(loginButton);
    }

    public String getLoginResult() {
        explicitWaitUntilVisible(5, loginResult);
        return getText(loginResult);
    }

}
