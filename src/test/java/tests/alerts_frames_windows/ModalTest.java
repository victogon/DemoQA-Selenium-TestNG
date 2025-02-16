package tests.alerts_frames_windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ModalTest extends BaseTest {

    public void testModalDialog() {
        var modalDialogsPage = homePage.goToAlertFramesWindows().clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        modalDialogsPage.clickCloseButton();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The Message Does Not Contain 'small modal' \n");
    }

}
