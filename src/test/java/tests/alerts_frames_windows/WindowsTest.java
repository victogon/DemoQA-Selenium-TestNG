package tests.alerts_frames_windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

@Test
public class WindowsTest extends BaseTest {

    public void testNewWindow() {
        var windowsPage = homePage.goToAlertFramesWindows().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL, "\n Actual & Expected URL's Do Not Match \n");
    }

}
