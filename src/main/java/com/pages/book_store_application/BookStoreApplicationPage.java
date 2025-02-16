package com.pages.book_store_application;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class BookStoreApplicationPage extends BasePage {

    private By loginMenuItem = By.xpath("//li[@id='item-0']/span[text()='Login']");

    public LoginPage clickLogin() {
        scrollToElementJS(loginMenuItem);
        click(loginMenuItem);
        return new LoginPage();
    }

}
