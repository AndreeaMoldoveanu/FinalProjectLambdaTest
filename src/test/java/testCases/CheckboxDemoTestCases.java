package testCases;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxDemoPage;
public class CheckboxDemoTestCases extends BasePage {
    private CheckboxDemoPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxDemoPage(driver);
    }
    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }
}