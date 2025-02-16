package tests.widgets;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SliderTest extends BaseTest {

    public void testSliderResult () {
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "88";
        Assert.assertEquals(actualValue, expectedValue, "\n Actual & Expected Values Do Not Match \n");
    }

}
