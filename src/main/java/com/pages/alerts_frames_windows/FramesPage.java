package com.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFramesWindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']/h1[text()='Frames']");
    private By iFrameBigBox = By.xpath("//div[@id='frame1Wrapper']/iframe");
    private String iFrameSmallBox = "frame2";

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToSmallBox() {
        switchToFrameString(iFrameSmallBox);
    }

    private void switchToBigBox() {
        switchToFrameElement(find(iFrameBigBox));
    }

    public String getTextInBigBox() {
        switchToBigBox();
        String bigBoxText = find(textInFrame).getText();
        System.out.println("Big Box Text: " + bigBoxText);
        switchToDefaultContent();
        return bigBoxText;
    }

    public String getTextInSmallBox() {
        switchToSmallBox();
        String smallBoxText = find(textInFrame).getText();
        System.out.println("Small Box Text: " + smallBoxText);
        switchToDefaultContent();
        return smallBoxText;
    }
}
