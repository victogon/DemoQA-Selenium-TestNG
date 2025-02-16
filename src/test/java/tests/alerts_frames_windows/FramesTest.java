package tests.alerts_frames_windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertFramesWindows().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigBox();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected Text Do Not Match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text Do Not Match\n");
    }

    @Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertFramesWindows().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallBox();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "\n Actual & Expected Text Do Not Match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text Do Not Match \n");
    }
}
