package tests.alerts_frames_windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        var alertsPage = homePage.goToAlertFramesWindows().clickAlerts();
        alertsPage.clickInformationAlertButton();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertFramesWindows().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationAlertResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");
    }

    public void testPromptAlert() {
        var alertsPage = homePage.goToAlertFramesWindows().clickAlerts();
        alertsPage.clickPromptAlertButton();
        String alertText = "Selenium";
        setAlertText(alertText);
        acceptAlert();
        String actualPromptResult = alertsPage.getPromptAlertResult();
        String expectedPromptResult = "You entered " + alertText;
        Assert.assertEquals(actualPromptResult, expectedPromptResult,
                "\n Actual & Expected Prompt Results Do Not Match \n");
    }

}
