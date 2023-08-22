package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxDemoPage extends BasePage {

    public CheckboxDemoPage(WebDriver driver){super(driver);}
    By SingleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/ul/li[2]/a");

    public void clickOnSingleCheckbox(){driver.findElement(SingleCheckbox).click();}
}
