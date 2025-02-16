package tests.forms;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CheckboxText extends BaseTest {

    public void testCheckBox() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSportsCheckbox();
        practiceFormPage.clickReadingCheckbox();
        practiceFormPage.clickMusicCheckbox();
        practiceFormPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = practiceFormPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox Is Selected \n");
    }

}
