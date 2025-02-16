package tests.forms;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RadioButtonTest extends BaseTest {

    public void testRadioButton() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = practiceFormPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button Is Not Selected \n");
    }

}
