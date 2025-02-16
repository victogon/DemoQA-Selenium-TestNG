package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LinksTest extends BaseTest {

    public void testLinks() {
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse + ") \n Does Not Contain '400' & 'Bad Request'");
    }

}
