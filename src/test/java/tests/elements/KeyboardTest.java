package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class KeyboardTest extends BaseTest {

    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Selenium Java");
        textBoxPage.setEmail("selenium@java.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3004");
        textBoxPage.setCurrentAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3004"),
                "Actual Address Does Not Contain 'Suite 3004'");
    }
}
