package tests.book_store_application;

import base.BaseTest;
import org.testng.annotations.Test;

@Test
public class LoginTest extends BaseTest {

    public void testLogin() {
        var loginPage = homePage.goToBookStoreApplication().clickLogin();
        loginPage.setName("John");
        loginPage.setPassword("admin");
        loginPage.clickLoginButton();
        String loginResult = loginPage.getLoginResult();
        System.out.println(loginResult);
    }

}
