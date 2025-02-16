package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButton() {
        var dynamicPropertiesPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "\n Actual & Expected Text Do Not Match \n");
    }
}
