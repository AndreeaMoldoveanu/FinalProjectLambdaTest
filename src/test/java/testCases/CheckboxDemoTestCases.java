package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxDemoPage;

public class CheckboxDemoTestCases extends BasePage {

    private CheckboxDemoPage checkboxDemoPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxDemoPage = new CheckboxDemoPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxDemoPage.clickOnSingleCheckbox();
        checkboxDemoPage.clickOnTheFirstCheckboxoption();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }
}