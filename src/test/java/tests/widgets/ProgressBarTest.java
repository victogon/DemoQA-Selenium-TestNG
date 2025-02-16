package tests.widgets;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ProgressBarTest extends BaseTest {

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue, "\n Value Is Not 100% \n");
    }

}
