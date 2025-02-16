package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class WebTableTest extends BaseTest {

    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        String email = "alden@example.com";
        String expectedAge = "30";
        webTablePage.clickEdit(email);
        webTablePage.setAge(expectedAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge,
                "\n Actual & Expected Ages Do Not Match \n");
    }

}
